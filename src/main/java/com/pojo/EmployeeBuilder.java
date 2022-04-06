package com.pojo;

public class EmployeeBuilder {

	private String first_name;
	private String last_name;
	private String id;
	private String email;

/*	 second way of doing 
 * 
	private EmployeeBuilder() {}
	
	public static EmployeeBuilder builder() {
		return new EmployeeBuilder();
	}	
*/	
	public EmployeeBuilder and() {       // just for readability
		return this;
	}
	
	public EmployeeBuilder with() {     // just for readability
		return this;
	}
	
	public EmployeeBuilder setFirst_name(String first_name) {
		this.first_name = first_name;
		return this ;
	}
	public EmployeeBuilder setLast_name(String last_name) {
		this.last_name = last_name;
		return this ;
	}
	public EmployeeBuilder setId(String id) {
		this.id = id;
		return this ;
	}
	public EmployeeBuilder setEmail(String email) {
		this.email = email;
		return this ;
	}
	
	public Employee build() {
		return new Employee(first_name,last_name,id,email);
	}
	
}
