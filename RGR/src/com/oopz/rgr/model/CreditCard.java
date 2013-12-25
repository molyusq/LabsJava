package com.oopz.rgr.model;

public class CreditCard {
	private double credit;
	private boolean status = false;
	
	public void setCredit(double credit) {
		this.credit = credit;
	}
	public double getCredit() {
		return credit;
	}
	
	public boolean getStatus() {
		return status;
	}
	public void changeStatus() {
		if(status)
			status = false;
		else status = true;
	}
}
