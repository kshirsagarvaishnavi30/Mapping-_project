package com.tka.client3;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class Department2 {
	@Id
	private int deptid;
	private String deptName;
	
	public Department2() {
		
	}

	public Department2(int deptid, String deptName) {
		super();
		this.deptid = deptid;
		this.deptName = deptName;
	}

	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Department2 [deptid=" + deptid + ", deptName=" + deptName + "]";
	}

}
