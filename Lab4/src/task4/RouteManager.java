package task4;

import java.util.ArrayList;

public class RouteManager {
		
	ArrayList<PassengerCarrier> carriers = new ArrayList<PassengerCarrier>();
	
	public RouteManager(String[] pointNames){						
		Car taxi = new Car(60, 0.25);
		taxi.setRoute("a","c");
		carriers.add(taxi);
		Airplane plane = new Airplane(500, 1);
		plane.setRoute("b","d");		
		carriers.add(plane);
		Train train = new Train(120, 0.5);
		train.setRoute("c","d");		
		carriers.add(train);
		Train train2 = new Train(78, 0.5);
		train2.setRoute("c","d");		
		carriers.add(train2);
	}	
	
	public ArrayList<PassengerCarrier> getBestCarriers(String pName1, String pName2){
		ArrayList<PassengerCarrier> pcList = new ArrayList<PassengerCarrier>();
		for(PassengerCarrier pc : carriers){
			if(pc.canConnect(pName1, pName2))
				pcList.add(pc);
		}
		return pcList;
	}
}
