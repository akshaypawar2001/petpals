package com.model;

public class Cats extends Pets {
	private int pet_id;
	private String cat_color;
	public Cats(int pet_id, String cat_color) {
		super();
		this.pet_id = pet_id;
		this.cat_color = cat_color;
	}
	public Cats() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cats(int id, String name, int age, String breed, Boolean available_for_adoption) {
		super(id, name, age, breed, available_for_adoption);
		// TODO Auto-generated constructor stub
	}
	public int getPet_id() {
		return pet_id;
	}
	public void setPet_id(int pet_id) {
		this.pet_id = pet_id;
	}
	public String getCat_color() {
		return cat_color;
	}
	public void setCat_color(String cat_color) {
		this.cat_color = cat_color;
	}
	@Override
	public String toString() {
		return "Cats [pet_id=" + pet_id + ", cat_color=" + cat_color + "]";
	}
	
}
