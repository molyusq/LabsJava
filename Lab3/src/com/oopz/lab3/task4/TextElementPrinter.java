package com.oopz.lab3.task4;

public class TextElementPrinter extends TextElementVisitor {
	
	private int indentationSize;
	
	public TextElementPrinter() {
		indentationSize = 4;
	}
	
	public TextElementPrinter(int indentationSize) {
		this.indentationSize = indentationSize;
	}
	
	@Override
	public void visit(String string) {
		System.out.print(string.toString());
	}

	@Override
	public void visit(Paragraph paragraph) {
		for (int i = 0; i < indentationSize; i++)
			System.out.print(" ");
		
		for (String string : paragraph.getStrings()) {
			string.accept(this);
			System.out.print(" ");
		}
		
		System.out.println();
	}

}
