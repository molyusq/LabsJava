package com.oopz.rgr.model;

public class Account {
	private double amount;

	public Account(double amount) {
		this.amount = amount;
	}

	public void setAmount(double amount) {
		if (this.amount + amount > 0)
			this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

	public int hashCode() {
		return (int) (11 * Math.floor(amount));
	}

	public String toString() {
		return getClass().getName() + "[amount=" + amount + "]";
	}

	public boolean equals(Object object) {
		if (object == this)
			return true;
		if (object != null || object instanceof Account) {
			Account another = (Account) object;
			return hashCode() == another.hashCode();
		}
		return false;
	}

	public String getData() {
		return amount + "$";
	}
}
