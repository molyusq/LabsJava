package com.oopz.rgr.model;

public class Admin {
	private String login;
	private String password;
	
	public Admin(String login, String password) {
		this.login = login;
		this.password = password;
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		if(!this.login.equals(login))
			this.login = login;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		if(!this.password.equals(password))
			this.password= password;
	}
	
	public String toString() {
		return getClass().getName() + "[login=" + login + ", password=" + password + "]";
	}
	
	public boolean equals(Object object) {
		if(object == this)
			return true;
		if(object != null || object instanceof Admin) {
			Admin another = (Admin) object;
			return login.equals(another.login) && password.equals(another.password);
		}
		return false;
	}
}
