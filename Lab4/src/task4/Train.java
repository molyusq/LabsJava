package task4;

public class Train extends PassengerCarrier {
	
	public Train(double avgSpeed, double inOutTime) {
		super(avgSpeed, inOutTime);
	}

	@Override
	public double getKoeficient() {
		return 0.9;
	}
}
