package com.oopz.lab3.task1;

public class CustomerPrinter {
	private Customer[] customers;
	
	public CustomerPrinter() {
		setCustomers(null);
	}
	
	public CustomerPrinter(Customer[] customers) {
		this.setCustomers(customers);
	}

	public Customer[] getCustomers() {
		return customers;
	}

	public void setCustomers(Customer[] customers) {
		this.customers = customers;
	}
	
	public void print() {
		for (Customer customer : customers) 
			System.out.println(customer.toString());
		
		System.out.println();
	}
	
	public void print(String header) {
		System.out.println(header);
		print();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == this) return true;
		if (obj == null || (obj.getClass() != this.getClass())) return false;
		
		CustomerPrinter printer = (CustomerPrinter) obj;
		
		if (customers == printer.customers) return true;
		if (customers.length != printer.customers.length) return false;
		
		for (int i = 0; i < printer.customers.length; i++)
			if (!customers[i].equals(printer.customers[i])) return false;
		
		return true;
	}
}
