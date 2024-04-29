package com.service;

import java.sql.SQLException;

import com.dao.DonationDao;
import com.dao.DonationDaoImpl;
import com.model.Donation;

public class DonationService {
	
	
DonationDao dao=new DonationDaoImpl();

public int recordDonation(Donation donation) throws SQLException {
	return dao.recordDonation(donation);
}


}
