package com.simplilearn.hibernatedemo.HibernateDemoEMS.model;

public class Employee {
	
	private int Id;
	private String empName;
	private double salary;
	private String department;
	
	public int getId() {
		return Id;
	}
	public void setId(int empId) {
		this.Id = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	

}
