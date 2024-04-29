package com.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.model.Participant;
import com.service.ParticipantService;

public class ParticipantController {
	public static void main(String[]args) {

	ParticipantService participantService=new ParticipantService();
	Scanner sc = new Scanner(System.in);
	while(true) {
		System.out.println("----------Participants Operations-------------");
		System.out.println("Press 1. Display All Participants ");
		System.out.println("Press 2. Register ");
		
		System.out.println("Press 0. to Exit");
		int input = sc.nextInt();
		if(input == 0) {
			System.out.println("Exiting Participants Module..");
			break; 
		}
		
		switch(input) {
		case 1: 
			List<Participant> list;
			try {
				list = participantService.findAllParticipant();
				for(Participant p : list) {
					System.out.println(p);
				}
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			break;
		case 2: 
			//System.out.println(UUID.randomUUID()); --auto generating alphanumeric for ID
			Random random = new Random(); 
			int randomNumber = random.nextInt(); 
			int ParticipantID =randomNumber<0?randomNumber*-1:randomNumber; 
			System.out.println("Enter ParticipantName");
			sc.nextLine();
			String ParticipantName = sc.nextLine();   
			System.out.println("Enter ParticipantType");
			String ParticipantType=sc.nextLine(); //email
			System.out.println("Enter event id");
			int EventID=sc.nextInt();
			/* Attach values to Object  */
			Participant participant = new Participant(ParticipantID, ParticipantName, ParticipantType, EventID);
			try {
				int status = participantService.register(participant);
				if(status == 1)
					System.out.println("Registration completed..");
				else
					System.out.println("Insert op failed");
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			
			break; 
			
			
		}}
}}
