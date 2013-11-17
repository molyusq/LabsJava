package com.oopz.lab3.task1;

import java.util.Arrays;
import java.util.Comparator;

public class CustomerProcessor {
	private Customer[] customers;
	
	public CustomerProcessor() {
		setCustomers(null);
	}
	
	public CustomerProcessor(Customer[] customers) {
		this.setCustomers(customers);
	}
	
	public void setCustomers(Customer[] customers) {
		this.customers = customers;
	}
	
	public Customer[] getSortedCustomers() {
		Customer[] sortedCustomers = new Customer[customers.length];
		System.arraycopy(customers, 0, sortedCustomers, 0, sortedCustomers.length);
		
		Arrays.sort(sortedCustomers, new Comparator<Customer>() {
			public int compare(Customer o1, Customer o2) {
				return o1.getSurname().compareTo(o2.getSurname());
			};
		});
		
		return sortedCustomers;
	}
	
	public Customer[] getCustomersInRange(long cardIdFrom, long cardIdTo) {
		int[] indexes = new int[customers.length];
		int numberOfCustomersInRange = 0;
		
		for (int i = 0; i < customers.length; i++)
			if (customers[i].getCardId() >= cardIdFrom && customers[i].getCardId() <= cardIdTo)
				indexes[numberOfCustomersInRange++] = i;
		
		Customer[] customersInRange = new Customer[numberOfCustomersInRange];
		
		for (int i = 0; i < numberOfCustomersInRange; i++)
			customersInRange[i] = customers[indexes[i]];
		
		return customersInRange;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == this) return true;
		if (obj == null || (obj.getClass() != this.getClass())) return false;
		
		CustomerProcessor processor = (CustomerProcessor) obj;
		
		if (customers == processor.customers) return true;
		if (customers.length != processor.customers.length) return false;
		
		for (int i = 0; i < processor.customers.length; i++)
			if (!customers[i].equals(processor.customers[i])) return false;
		
		return true;
	}
}
