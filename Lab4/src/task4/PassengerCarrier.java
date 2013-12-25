package task4;


abstract public class PassengerCarrier {
	
	private double avgSpeed;
	private double inOutTime;	
	private String[] route = new String[2];
	
	public PassengerCarrier(double avgSpeed, double inOutTime) {
		this.avgSpeed = avgSpeed;
		this.inOutTime = inOutTime;
	}
	
	public double getAverageSpeed() {
		return avgSpeed;
	}
	public double getInOutTime() {
		return inOutTime;
	}
	
	public void setRoute(String p1,String p2){
		route[0] = p1;
		route[1] = p2;
	}
	
	public boolean canConnect(String p1,String p2){
		return route[0].equals(p1) && route[1].equals(p2);
	}
	
	public String toString(){
		return this.getClass() + "[avgSpeed="+avgSpeed+", inOutTime="+inOutTime+"]";
	}
	
	abstract public double getKoeficient();
}
