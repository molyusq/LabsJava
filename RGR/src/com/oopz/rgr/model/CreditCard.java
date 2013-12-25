package com.oopz.rgr.model;

public class CreditCard {
	private double credit;
	private boolean status = true;

	public CreditCard(double credit) {
		this.credit = credit;
	}

	public void setCredit(double credit) {
		if (credit < 0)
			return;
		this.credit = credit;
	}

	public double getCredit() {
		return credit;
	}

	public boolean getStatus() {
		return status;
	}

	public void changeStatus() {
		if (status)
			status = false;
		else
			status = true;
	}

	public int hashCode() {
		return (int) (11 * Math.floor(credit));
	}

	public String toString() {
		return getClass().getName() + "[credit=" + credit + ", status="
				+ status + "]";
	}

	public String getData() {
		return "" + credit + "$ [" + status + "]";
	}

	public boolean equals(Object object) {
		if (object == this)
			return true;
		if (object != null || object instanceof CreditCard) {
			CreditCard another = (CreditCard) object;
			return credit == another.credit && status == another.status;
		}
		return false;
	}
}
