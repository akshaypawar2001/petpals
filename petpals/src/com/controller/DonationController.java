package com.controller;

import java.sql.SQLException;
import java.util.Random;
import java.util.Scanner;

import com.model.Donation;
import com.model.Pets;
import com.service.DonationService;
import com.service.PetsService;

public class DonationController {

	public static void main(String[] args) {
		DonationService donationService=new DonationService();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("----------Donation Operations-------------");
			System.out.println("Press 1. Add Donor's Data ");
			
			
			System.out.println("Press 0. to Exit");
			int input = sc.nextInt();
			if(input == 0) {
				System.out.println("Exiting Donation Module ..");
				break; 
			}
			switch(input) {
			case 1: 
				//System.out.println(UUID.randomUUID()); --auto generating alphanumeric for ID
				Random random = new Random(); 
				int randomNumber = random.nextInt(); 
				int id =randomNumber<0?randomNumber*-1:randomNumber; 
				System.out.println("Enter Donor Name");
				sc.nextLine();
				String donor_name = sc.nextLine();   
				System.out.println("Enter amount");
				double amount =sc.nextDouble(); 
				sc.nextLine();
				System.out.println("Enter pet Id");
				int pet_id =sc.nextInt(); 
				sc.nextLine();
				
				
				/* Attach values to Object  */
				Donation donation=new Donation(id,donor_name, amount, pet_id);
				
				
				try {
					int status = donationService.recordDonation(donation);
					if(status == 1)
						System.out.println("Donor's Data added to DB..");
					else
						System.out.println("Insert operation failed");
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
				
				 
				
				
		}
			
		
		}
		sc.close();
	}}


