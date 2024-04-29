package com.model;

public class Pets {
	private int id;
	private String name;
	private int age;
	private String breed;
	private Boolean available_for_adoption;
	@Override
	public String toString() {
		return "Pets [id=" + id + ", name=" + name + ", age=" + age + ", breed=" + breed + ", available_for_adoption="
				+ available_for_adoption + "]";
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public Boolean getAvailable_for_adoption() {
		return available_for_adoption;
	}
	public void setAvailable_for_adoption(Boolean available_for_adoption) {
		this.available_for_adoption = available_for_adoption;
	}
	public Pets() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pets(int id, String name, int age, String breed, Boolean available_for_adoption) {
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.breed = breed;
		this.available_for_adoption = available_for_adoption;
	}
}
