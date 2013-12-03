package task4;

abstract public class PassengerCarrier {
	private int workDistance;
	private boolean canConnect;
	
	public PassengerCarrier(int workDistance, boolean canConnect) {
		this.workDistance = workDistance;
		this.canConnect = canConnect;
	}
	
	public int getWorkDistance() {
		return workDistance;
	}
	public boolean getConnect() {
		return canConnect;
	}
}
