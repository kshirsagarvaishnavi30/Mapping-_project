package com.tka.client2;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Department {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int did;
	private String dept_name;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="did")	
	private List<Employee>allemp;
	
	public Department() {
		
	}

	public Department(int did, String dept_name, List<Employee> allemp) {
		super();
		this.did = did;
		this.dept_name = dept_name;
		this.allemp = allemp;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	public List<Employee> getAllemp() {
		return allemp;
	}

	public void setAllemp(List<Employee> allemp) {
		this.allemp = allemp;
	}

	@Override
	public String toString() {
		return "Department [did=" + did + ", dept_name=" + dept_name + ", allemp=" + allemp + "]";
	}

	
}
