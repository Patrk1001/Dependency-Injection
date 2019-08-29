/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.umsl.umslLearnDI;

/**
 *
 * @author patrick
 */
public class Department {
    private int departmentID;
	private String departmentName;
	
	
	public Department() {
	}
	

	public Department(int departmentID, String departmentName) {
		super();
		this.departmentID = departmentID;
		this.departmentName = departmentName;
		
	}


	public int getDepartmentID() {
		return departmentID;
	}
	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}
	public String getdepartmentName() {
		return departmentName;
	}
	public void setdepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}


	@Override
	public String toString() {
		return "Department [departmentID=" +departmentID+ ", departmentName=" +departmentName+ "]";
	}

	
	
	

}

