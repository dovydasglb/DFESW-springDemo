package com.qa.chocolate.domain;

public class Chocolate {

	private String name;
	
	private String brand;
	
	private String type;
	
	private int tastiness;
	
	private String texture;
	
	private int sugarContent;

	//default constructor
	public Chocolate() {
		super();
	}

	
	//constructor with everything
	public Chocolate(String name, String brand, String type, int tastiness, String texture, int sugarContent) {
		super();
		this.name = name;
		this.brand = brand;
		this.type = type;
		this.tastiness = tastiness;
		this.texture = texture;
		this.sugarContent = sugarContent;
	}


	//getter and setters
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getTastiness() {
		return tastiness;
	}


	public void setTastiness(int tastiness) {
		this.tastiness = tastiness;
	}


	public String getTexture() {
		return texture;
	}


	public void setTexture(String texture) {
		this.texture = texture;
	}


	public int getSugarContent() {
		return sugarContent;
	}


	public void setSugarContent(int sugarContent) {
		this.sugarContent = sugarContent;
	}

}
