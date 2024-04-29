package com.service;

import java.sql.SQLException;
import java.util.List;

import com.dao.ParticipantDao;
import com.dao.ParticipantDaoImpl;
import com.model.Participant;

public class ParticipantService {

	ParticipantDao dao=new ParticipantDaoImpl();

	public List<Participant> findAllParticipant() throws SQLException {
		return dao.findAllParticipant();
	}

	public int register(Participant participant) throws SQLException {
		return dao.register(participant);
	}

}
