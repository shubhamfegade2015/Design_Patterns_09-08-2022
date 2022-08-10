package com.hexaware.crudoperationusingjava;

public class Seller {
	public int id;
	public String name;
	public String email;
	public String location;
	
	public Seller() {}
	
	public Seller(int id,String name,String email,String location)
	{
		this.id=id;
		this.name=name;
		this.email=email;
		this.location=location;
		
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
	
	

}
