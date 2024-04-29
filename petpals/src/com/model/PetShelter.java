package com.model;

public class PetShelter {
	private int id;
	private String name;
	private String location;
	private int pet_id;
	private boolean availability;
	@Override
	public String toString() {
		return "PetShelter [id=" + id + ", name=" + name + ", location=" + location + ", pet_id=" + pet_id
				+ ", availability=" + availability + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getPet_id() {
		return pet_id;
	}
	public void setPet_id(int pet_id) {
		this.pet_id = pet_id;
	}
	public boolean isAvailability() {
		return availability;
	}
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	public PetShelter() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PetShelter(int id, String name, String location, int pet_id, boolean availability) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.pet_id = pet_id;
		this.availability = availability;
	}
}
