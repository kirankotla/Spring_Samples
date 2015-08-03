package com.app;

public class Pincode {
	
	private String pin;
	private String state;
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Pincode [pin=" + pin + ", state=" + state + "]";
	}

	

}
