package com.model;

public class Dogs extends Pets{
   private	int pet_id;
	private String dog_breed;
	public Dogs(int pet_id, String dog_breed) {
		super();
		this.pet_id = pet_id;
		this.dog_breed = dog_breed;
	}
	public Dogs() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dogs(int id, String name, int age, String breed, Boolean available_for_adoption) {
		super(id, name, age, breed, available_for_adoption);
		// TODO Auto-generated constructor stub
	}
	public int getPet_id() {
		return pet_id;
	}
	public void setPet_id(int pet_id) {
		this.pet_id = pet_id;
	}
	public String getDog_breed() {
		return dog_breed;
	}
	public void setDog_breed(String dog_breed) {
		this.dog_breed = dog_breed;
	}
	@Override
	public String toString() {
		return "Dogs [pet_id=" + pet_id + ", dog_breed=" + dog_breed + "]";
	}
	

}
