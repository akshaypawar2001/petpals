package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import com.model.Donation;
import com.utility.DBConnection;

public class DonationDaoImpl implements DonationDao{

	@Override
	
	public int recordDonation(Donation donation) throws SQLException {
		Connection con = DBConnection.dbConnect();
		String sql="INSERT INTO Donations (id,donor_name, amount, pet_id) VALUES (?,?,?,?)";
		
		PreparedStatement pstmt = con.prepareStatement(sql);
		//attach the data
		pstmt.setInt(1, donation.getId());
		pstmt.setString(2,donation.getDonor_name());
		pstmt.setDouble(3, donation.getAmount());
		pstmt.setInt(4, donation.getPet_id());
	
		//execute the query 
		int status = pstmt.executeUpdate(); //1: if all good., 0 - if op fails 
		DBConnection.dbClose();
		return status;
	}

	

}
