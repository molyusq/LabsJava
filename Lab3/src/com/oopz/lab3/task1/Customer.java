package com.oopz.lab3.task1;

public class Customer {
	private int id;
	private String surname;
	private String name;
	private String middlename;
	private String address;
	private long cardId;
	private long accoundId;
	
	public Customer() {
		id = -1;
		surname = "";
		name = "";
		middlename = "";
		address = "";
		cardId = -1;
		accoundId = -1;
	}
	
	public Customer(int id, String surname, String name, String middlename, String address, long cardId, long accountId) {
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.middlename = middlename;
		this.address = address;
		this.cardId = cardId;
		this.accoundId = accountId;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMiddlename() {
		return middlename;
	}
	
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	
	public long getCardId() {
		return cardId;
	}
	
	public void setCardId(long cardId) {
		this.cardId = cardId;
	}
	
	public long getAccoundId() {
		return accoundId;
	}
	
	public void setAccoundId(long accoundId) {
		this.accoundId = accoundId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == this) return true;
		if (obj == null || (obj.getClass() != this.getClass())) return false;
		
		Customer customer = (Customer) obj;
		
		return id == customer.getId() &&
				surname.equals(customer.getSurname()) &&
				name.equals(customer.getName()) &&
				middlename.equals(customer.getMiddlename()) &&
				address.equals(customer.getAddress()) &&
				cardId == customer.getCardId() &&
				accoundId == customer.getAccoundId();
	}
	
	@Override
	public String toString() {
		return name + ", " + surname + ", " + middlename + ", " + address + ", " + cardId + ", " + accoundId;
	}
}
