package com.oopz.rgr.model;

public class Admin extends User {

	public Admin(String login, String password) {
		super(login, password);
	}

	public String toString() {
		return getClass().getName() + " " + super.toString();
	}

	public boolean equals(Object object) {
		if (object == this)
			return true;
		if (object != null || object instanceof Admin) {
			Admin another = (Admin) object;
			return super.equals((User) another);
		}
		return false;
	}
}
