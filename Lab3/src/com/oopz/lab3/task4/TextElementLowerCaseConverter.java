package com.oopz.lab3.task4;

public class TextElementLowerCaseConverter extends TextElementVisitor {

	@Override
	public void visit(String string) {
		for (int i = 0; i < string.getChars().length; i++)
			string.getChars()[i] = Character.toLowerCase(string.getChars()[i]);
	}


}
