package com.oopz.rgr.model;

public class Client {
	private String fName;
	private String lName;
	private String login;
	private String password;
	private int age;
	private Account account;
	private CreditCard card;
	
	public Client(String fName, String lName, int age, String login, String password) {
		this.fName = fName;
		this.lName = lName;
		this.age = age;
		this.login = login;
		this.password = password;
	}
	
	public void setFirstName(String fName) {
		this.fName = fName;
	}
	public String getFirstName() {
		return fName;
	}
	
	public void setLastName(String lName) {
		this.lName = lName;
	}
	public String getLastName() {
		return lName;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
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
	
	public int hashcode() {
		final int coef = 11;
		return age * coef;
	}
	
	public String toString() {
		return getClass().getName() + "[fName=" + fName + ", lName=" + lName + ", age=" + age + ", account=" + account + ", card=" + card.toString() + "]";
	}
	
	public boolean equals(Object object) {
		if(object == this)
			return true;
		if(object != null || object instanceof Client) {
			Client another = (Client) object;
			return fName.equals(another.fName) && lName.equals(another.lName) && hashCode() == another.hashCode() && account.equals(another.account) && card.equals(another.card) && login.equals(another.login) && password.equals(another.password);
		}
		return false;
	}
}
