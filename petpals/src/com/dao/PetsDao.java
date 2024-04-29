package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.exception.InvalidInputException;
import com.model.Pets;

public interface PetsDao {
	int save(Pets pets) throws SQLException; 
	void softDeleteById(int id) throws SQLException,InvalidInputException;
	Boolean isAvailable(int id) throws SQLException; 
	List<Pets> findAllAvailable() throws SQLException;
}
