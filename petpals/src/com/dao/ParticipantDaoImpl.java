package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Participant;
import com.utility.DBConnection;

public class ParticipantDaoImpl implements ParticipantDao{

	@Override
	public List<Participant> findAllParticipant() throws SQLException {
		Connection con = DBConnection.dbConnect();
		String sql="select * from participants";
		PreparedStatement pstmt = con.prepareStatement(sql);
		ResultSet rst = pstmt.executeQuery();
		List<Participant> list = new ArrayList<>();
		while(rst.next() == true) {
			int participantID  = rst.getInt("participantID");
			String participantName = rst.getString("participantName");
			String participantType = rst.getString("participantType");
			int eventID  = rst.getInt("eventID");
			Participant participant = new Participant( participantID,participantName, participantType,eventID); //100X 200X 300X
			list.add(participant);
		}
		DBConnection.dbClose();		
		return list;
	}

	@Override
	public int register(Participant participant) throws SQLException {
		Connection con = DBConnection.dbConnect();
		String sql="INSERT  INTO Participants (ParticipantID, ParticipantName, ParticipantType, EventID )VALUES (?,?,?,?)";
		//prepare the statement 
		PreparedStatement pstmt = con.prepareStatement(sql);
		//attach the data
		pstmt.setInt(1, participant.getParticipantID());
		pstmt.setString(2, participant.getParticipantName());
		pstmt.setString(3, participant.getParticipantType());
		pstmt.setInt(4, participant.getEventID());
		//execute the query 
		int status = pstmt.executeUpdate(); //1: if all good., 0 - if op fails 
		DBConnection.dbClose();
		return status;
	}

}
