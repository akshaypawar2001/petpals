package com.dao;

import java.sql.SQLException;


import com.model.Donation;
import com.model.Pets;

public  interface DonationDao {
	public int recordDonation(Donation donation) throws SQLException;
	
	
}
