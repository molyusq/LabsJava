package task4;

public class Car extends PassengerCarrier {

	public Car(double avgSpeed, double inOutTime) {
		super(avgSpeed, inOutTime);
	}

	@Override
	public double getKoeficient() {
		return 0.5;
	}
}
