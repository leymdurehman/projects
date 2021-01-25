package com.techelevator;

public class Employee {

private	int employeeId;		
private String firstName;
private String lastName;
private String department;
private double annualSalary;	
	

//Constructor
public Employee(int employeeId, String firstName, String lastName, double salary) {
this.employeeId = employeeId;		
this.firstName = firstName;
this.lastName = lastName; 
this.department = department;

	
annualSalary = salary;
	
}


public int getEmployeeId() {
	
	return this.employeeId;
	
}

public String getFirstName() {
	
	return this.firstName;
	
}

public String getLastName() {
	
	return this.lastName;

}

public void setLastName(String lastName) {
	
	this.lastName = lastName;

}


public String getFullName() {
	
	
	return (this.lastName + ", " + this.firstName);
}

public String getDepartment() {
	
	return this.department;
	
}

public void setDepartment( String department) {			//setters are void
	
	this.department = department;
	
}	
	
public double getAnnualSalary() {
	
	return this.annualSalary;
}	
	

public void raiseSalary(double percent) {
	
	double percentToDecimal = percent / 100;
	double amountToRaise = this.annualSalary * percentToDecimal;
	this.annualSalary = this.annualSalary + amountToRaise;
	
}
	
	















	
	
	
}
