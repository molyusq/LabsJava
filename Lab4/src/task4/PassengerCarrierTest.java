package task4;

import java.util.ArrayList;


public class PassengerCarrierTest {

	public static void main(String[] args) {
		String[] pointNames = new String[]{"A", "B", "C", "D"};
		RouteManager rm = new RouteManager(pointNames);
		UserInput.getInstance().printMessage("Enter route: from");
		String from = UserInput.getInstance().getUserInput();
		UserInput.getInstance().printMessage("Enter route: to");
		String to = UserInput.getInstance().getUserInput();
		double distance = 100;
		ArrayList<PassengerCarrier> carriers = rm.getBestCarriers(from, to);
		if(carriers.size()>0){
			UserInput.getInstance().printMessage("Available carriers ("+carriers.size()+"):");
			for(PassengerCarrier pc : carriers){
				double pcTime = distance/pc.getAverageSpeed()*pc.getKoeficient();
				UserInput.getInstance().printMessage(pc.toString()+" in "+pcTime+" hours");
			}
		}else{
			UserInput.getInstance().printMessage("no carriers to drive you there");
		}
	}

}
