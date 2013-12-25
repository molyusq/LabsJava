package com.oopz.rgr.model;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class Client extends User {
	private String fName;
	private String lName;
	private int age;
	private Account account;
	private CreditCard card;
	private List<PropertyChangeListener> listener = new ArrayList<PropertyChangeListener>();

	public Client(String fName, String lName, int age, String login,
			String password) {
		super(login, password);
		this.fName = fName;
		this.lName = lName;
		this.age = age;
		this.account = new Account(1000);
		this.card = new CreditCard(100);
	}

	public void setFirstName(String fName) {
		notifyListeners(this, "firstName", this.fName, fName);
		this.fName = fName;
	}

	public String getFirstName() {
		return fName;
	}

	public void setLastName(String lName) {
		notifyListeners(this, "lastName", this.fName, fName);
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

	public void setAccountAmount(double amount) {
		double old = account.getAmount();
		account.setAmount(amount);
		notifyListeners(this, "account", old, account.getAmount());
	}

	public void setCreditAmount(double amount) {
		double old = card.getCredit();
		card.setCredit(amount);
		notifyListeners(this, "card", old, card.getCredit());
	}

	public CreditCard getCard() {
		return card;
	}

	public Account getAccount() {
		return account;
	}

	public int hashcode() {
		final int coef = 11;
		return age * coef;
	}

	public String toString() {
		return getClass().getName() + "[fName=" + fName + ", lName=" + lName
				+ ", age=" + age + ", account=" + account + ", card="
				+ card.toString() + "]";
	}

	public boolean equals(Object object) {
		if (object == this)
			return true;
		if (object != null || object instanceof Client) {
			Client another = (Client) object;
			return fName.equals(another.fName) && lName.equals(another.lName)
					&& hashCode() == another.hashCode()
					&& account.equals(another.account)
					&& card.equals(another.card)
					&& super.equals((User) another);
		}
		return false;
	}

	public boolean blockCard() {
		notifyListeners(this, "card", true, false);
		if (card.getStatus()) {
			card.changeStatus();
			return true;
		}
		return false;
	}

	public boolean nullifyAccount() {
		notifyListeners(this, "account", account.getAmount(), 0);
		if (account.getAmount() > 0) {
			account.setAmount(0);
			return true;
		}
		return false;
	}

	public boolean sendToAnotherAccount(int amount, Account another) {
		notifyListeners(this, "account", 0, 0);
		if (account == another)
			return false;
		if (account.getAmount() >= amount) {
			another.setAmount(another.getAmount() + amount);
			account.setAmount(account.getAmount() - amount);
			return true;
		} else
			return false;
	}

	private void notifyListeners(Object object, String property,
			Object oldValue, Object newValue) {
		for (PropertyChangeListener name : listener) {
			name.propertyChange(new PropertyChangeEvent(this, property,
					oldValue, newValue));
		}
	}

	public void addChangeListener(PropertyChangeListener newListener) {
		listener.add(newListener);
	}

}
