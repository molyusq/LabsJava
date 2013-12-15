package com.oopz.lab3.task4;

import java.util.ArrayList;
import java.util.Iterator;


public class TextElementTest {
	
	private static TextElementVisitor printer = new TextElementPrinter(8);
	private static TextElementVisitor uppercaseConverter = new TextElementUpperCaseConverter();
	private static TextElementVisitor lowercaseConverter = new TextElementLowerCaseConverter();
	
	public static void print(Iterator<TextElement> iterator) {
		while (iterator.hasNext()) {
			iterator.next().accept(printer);
		}
	}
	
	public static void main(java.lang.String[] args) {
		ArrayList<TextElement> textElements = new ArrayList<TextElement>();
		
		String string1 = new String("Hello!");
		String string2 = new String("This is the test of text elements.");
		String string3 = new String("Task is a part of lab #3.");
		String string4 = new String("The discipline is OOPZ.");
		
		Paragraph paragraph = new Paragraph(new String[] { string1, string2 });
		
		textElements.add(paragraph);
		textElements.add(string3);
		textElements.add(string4);
		
		System.out.println("Initial text:");
		print(textElements.iterator());
		System.out.println();
		System.out.println();
		
		System.out.println("Uppercased text:");
		
		for (TextElement element : textElements) {
			element.accept(uppercaseConverter);
		}
		print(textElements.iterator());
		System.out.println();
		System.out.println();

		
		System.out.println("Lowercased text:");
		
		for (TextElement element : textElements) {
			element.accept(lowercaseConverter);
		}
		print(textElements.iterator());
		System.out.println();
		System.out.println();

	}

}
