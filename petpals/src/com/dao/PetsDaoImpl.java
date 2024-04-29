package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.exception.InvalidInputException;
import com.model.Pets;
import com.utility.DBConnection;

public class PetsDaoImpl implements PetsDao {

	@Override
	public int save(Pets pets) throws SQLException {
		
			Connection con = DBConnection.dbConnect();
			String sql="INSERT INTO Pets (id, name, age, breed, available_for_adoption)  VALUES (?,?,?,?,?)";
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			//attach the data
			pstmt.setInt(1, pets.getId());
			pstmt.setString(2, pets.getName());
			pstmt.setInt(3, pets.getAge());
			pstmt.setString(4, pets.getBreed());
			pstmt.setBoolean(5, pets.getAvailable_for_adoption());
			//execute the query 
			int status = pstmt.executeUpdate(); //1: if all good., 0 - if op fails 
			DBConnection.dbClose();
			return status;
		}

	@Override
	public void softDeleteById(int id) throws SQLException, InvalidInputException {
		Connection con = DBConnection.dbConnect();
		String sql=" update pets SET  available_for_adoption='0' where id =?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, id);
		pstmt.executeUpdate();
		DBConnection.dbClose();	
		
	}

	@Override
	public Boolean isAvailable(int id) throws SQLException {
		Connection con = DBConnection.dbConnect();
		String sql="select id from pets where id=?";
		//prepare the statement 
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, id);
		ResultSet rst  = pstmt.executeQuery();
		boolean status = rst.next(); //true / false
		DBConnection.dbClose();
		return status;
	}

	@Override
	public List<Pets> findAllAvailable() throws SQLException {
		Connection con = DBConnection.dbConnect();
		String sql="select * from pets where available_for_adoption=1";
		PreparedStatement pstmt = con.prepareStatement(sql);
		ResultSet rst = pstmt.executeQuery();
		List<Pets> list = new ArrayList<>();
		while(rst.next() == true) {
			int id  = rst.getInt("id");
			String name = rst.getString("name");
			int age  = rst.getInt("age");
			String breed = rst.getString("breed");
			boolean available_for_adoption= rst.getBoolean("available_for_adoption");
			Pets 	pets = new 	Pets(id, name, age, breed, available_for_adoption); 
			list.add(pets);
		}
		DBConnection.dbClose();		
		return list;
	}
	}


