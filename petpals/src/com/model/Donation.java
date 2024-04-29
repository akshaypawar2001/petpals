package com.model;

public class Donation {
	private int id;
	private String donor_name;
	@Override
	public String toString() {
		return "Donation [id=" + id + ", donor_name=" + donor_name + ", amount=" + amount + ", pet_id=" + pet_id + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDonor_name() {
		return donor_name;
	}
	public void setDonor_name(String donor_name) {
		this.donor_name = donor_name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getPet_id() {
		return pet_id;
	}
	public void setPet_id(int pet_id) {
		this.pet_id = pet_id;
	}
	public Donation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Donation(int id, String donor_name, double amount, int pet_id) {
		super();
		this.id = id;
		this.donor_name = donor_name;
		this.amount = amount;
		this.pet_id = pet_id;
	}
	private double amount;
	private int pet_id;

}
