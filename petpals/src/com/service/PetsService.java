package com.service;

import java.sql.SQLException;
import java.util.List;

import com.dao.PetsDao;
import com.dao.PetsDaoImpl;
import com.exception.InvalidInputException;
import com.model.Pets;

public class PetsService {
	PetsDao dao=new PetsDaoImpl();	
	public int save(Pets pets) throws SQLException {
			
		return dao.save(pets);
	}

	public void softDeleteById(int id1) throws InvalidInputException, SQLException {
		boolean isIdValid = dao.isAvailable(id1);
		if(!isIdValid)
			throw new InvalidInputException("Id given is Invalid!!");
		 
		dao.softDeleteById(id1);
		
	}

	public List<Pets> findAllAvailable() throws SQLException {
		return dao.findAllAvailable();	}



}
