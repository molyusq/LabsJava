package task1;

import java.util.Scanner;

public class StringsInput {
	
	/* Singleton Pattern */
	private static StringsInput instance;
	public static StringsInput getInstance(){
		if(instance==null)
			instance = new StringsInput();
		return instance;
	}
	
	private Scanner scanner;
	private String wrongInputMessage;
	
	private StringsInput(){		
		scanner = new Scanner(System.in);
	}
	
	public void printMessage(String message){
		System.out.println(message);
	}
	
	public String getUserInput(){		
		return scanner.next();
	}
	
	public void setWrongInputMessage(String msg){
		wrongInputMessage = msg;
	}
	
	public int getPositiveInteger(){
		int n = 0;
		do{			
			String strN = getUserInput();
			try{
				n = Integer.parseInt(strN);
			}catch(Exception e){
				if(wrongInputMessage!=null)
					printMessage(wrongInputMessage);
			}
		}while(n<1);
		return n;
	}
}
