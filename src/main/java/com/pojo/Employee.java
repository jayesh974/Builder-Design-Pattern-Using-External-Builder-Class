package com.pojo;

public class Employee {

	private String first_name;
	private String last_name;
	private String id;
	private String email;

	public Employee(String first_name, String last_name, String id, String email) {
		
		this.first_name = first_name;
		this.last_name = last_name;
		this.id = id;
		this.email = email;
	}

	public String getFirst_name() {
		return first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public String getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	
}
