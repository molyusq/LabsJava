package com.gmail.zhuk.andriy.task2;

import java.io.*;

public class UserInputHandler {
	private DividendFinder finder;
	
	public UserInputHandler(DividendFinder finder) {
		this.finder = finder;
	}
	
	String userInput;
	InputStreamReader inputReader = new InputStreamReader(System.in);
	BufferedReader reader = new BufferedReader(inputReader);
	/*DividendFinder finder = new DividendFinder(3, 9);
	try {
		System.out.print("Enter quantity: ");
		userInput = reader.readLine();
		System.out.println("Enter numbers: ");
		arraySize = Integer.parseInt(userInput);
		array = new int[arraySize];
		for(int i=0; i < arraySize; i++) {
			userInput = reader.readLine();
			array[i] = Integer.parseInt(userInput);
		}
		System.out.print("Dividents: ");
		for(int i = 0; i < arraySize; i++) {
			if(finder.isDividend(array[i]))
				System.out.print(array[i] + " ");
		}
		System.out.println();
	} catch (Exception e) {
		System.out.println("Input Error: " + e.getMessage());
	}*/
}
