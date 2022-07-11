package com.learn.stackusingarray;

public class Employee {
	String name;
	int employeeId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public Employee(String name, int employeeId) {
		super();
		this.name = name;
		this.employeeId = employeeId;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", employeeId=" + employeeId + "]";
	}

}
