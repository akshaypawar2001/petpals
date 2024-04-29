package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.model.Participant;

public interface ParticipantDao {
	List<Participant> findAllParticipant() throws SQLException;
	int register(Participant participant) throws SQLException; 
}
