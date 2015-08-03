package com.app;

public class Employe {
	
	
	private  int empId;
	private  String empName;
	private Address addr;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Employe [empId=" + empId + ", empName=" + empName + ", addr="
				+ addr + "]";
	}
	
	

}
