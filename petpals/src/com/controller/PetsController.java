package com.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.exception.InvalidInputException;
import com.model.Pets;
import com.service.PetShelterService;
import com.service.PetsService;

public class PetsController {

	public static void main(String[] args) {
		PetsService petsService=new PetsService();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("----------PetShelter Operations-------------");
			System.out.println("Press 1. Add Pets to available list ");
			System.out.println("Press 2. Soft Delete Pets ");
			System.out.println("Press 3. List of all available pets ");
			
			System.out.println("Press 0. to Exit");
			int input = sc.nextInt();
			if(input == 0) {
				System.out.println("Exiting PetShelter Module ..");
				break; 
			}
			switch(input) {
			case 1: 
				//System.out.println(UUID.randomUUID()); --auto generating alphanumeric for ID
				Random random = new Random(); 
				int randomNumber = random.nextInt(); 
				int id =randomNumber<0?randomNumber*-1:randomNumber; 
				System.out.println("Enter Name");
				sc.nextLine();
				String name = sc.nextLine();   
				System.out.println("Enter Age");
				int  age =sc.nextInt(); 
				sc.nextLine();
				System.out.println("Enter breed");
				String breed=sc.nextLine();
				
				System.out.println("Enter available_for_adoption");
				boolean available_for_adoption=sc.nextBoolean();
				/* Attach values to Object  */
				Pets pets = new Pets(id, name, age, breed, available_for_adoption);
				try {
					int status = petsService.save(pets);
					if(status == 1)
						System.out.println("Pet Data added to DB..");
					else
						System.out.println("Insert operation failed");
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
				
				break;
			case 2: 
				System.out.println("Enter Pet ID");
				int id1=sc.nextInt();			
				try {
					petsService.softDeleteById(id1);
					System.out.println("pet removed from Availability List..");
				} catch (InvalidInputException|SQLException e) {
					System.out.println(e.getMessage());
				} 			
				break; 
			case 3:
				List<Pets> list;
				try {
					list = petsService.findAllAvailable();
					for(Pets p : list) {
						System.out.println(p);
				} }catch (SQLException e) {
					System.out.println(e.getMessage());
				}
				
		
	          }
	}
		

		

	}}
