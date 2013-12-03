package com.oopz.lab3.task4;

public abstract class TextElementVisitor {
	
	public abstract void visit(String string);
	
	
	public void visit(Paragraph paragraph) {
		for (String string : paragraph.getStrings())
			string.accept(this);
	}
	
}
