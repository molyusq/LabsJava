package com.oopz.lab3.task1;

public class CustomerTest {
	
	private static int cardIdFrom = 2;
	private static int cardIdTo = 3;
	
	public static void main(String[] args) {
		Customer customer1 = new Customer(1, "Palianytsia", "Oleh", "V.", "Kovalskyy 5/417", 1, 1);
		Customer customer2 = new Customer(2, "Zhuck", "Andrew", "C.", "Kovalskyy 5/420", 2, 43);
		Customer customer3 = new Customer(5, "Hadyniack", "Rus", "A.", "Kovalskyy 5/420", 3, 54);
		
		Customer[] customers = new Customer[] { customer1, customer2, customer3 };
		
		CustomerPrinter printer = new CustomerPrinter(customers);
		printer.print("All customers:");
		
		CustomerProcessor processor = new CustomerProcessor(customers);
		
		printer.setCustomers(processor.getSortedCustomers());
		printer.print("Sorted customers:");
		
		printer.setCustomers(processor.getCustomersInRange(2, 3));
		printer.print("Customers in range [ " + cardIdFrom + ", " + cardIdTo + " ]: ");
	}
}
