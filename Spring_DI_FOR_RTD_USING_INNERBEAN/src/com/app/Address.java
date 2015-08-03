package com.app;

public class Address {
	
	private  String hno;
	private String state;
	public String getHno() {
		return hno;
	}
	public void setHno(String hno) {
		this.hno = hno;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", state=" + state + "]";
	}
	
	

}
