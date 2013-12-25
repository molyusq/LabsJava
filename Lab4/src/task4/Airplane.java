package task4;

public class Airplane extends PassengerCarrier {
	
	public Airplane(double avgSpeed, double inOutTime) {
		super(avgSpeed, inOutTime);
	}

	@Override
	public double getKoeficient() {
		return 1;
	}
	
}
