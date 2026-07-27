package com.tka.client3;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee2 {
	@Id
	private int empid;
	private String empName;
	private double salary;
	
	@ManyToOne
    @JoinColumn(name="dept_id")
    private Department2 department;
	
	public Employee2() {
		
	}

	public Employee2(int empid, String empName, double salary,Department2 department) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.salary = salary;
	    this.department = department;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
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

	public Department2 getDepartment() {
		return department;
	}

	public void setDepartment(Department2 department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee2 [empid=" + empid + ", empName=" + empName + ", salary=" + salary + "]";
	}
	

}
