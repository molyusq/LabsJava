package task3;

public class AutoTest {

	public static void main(String[] args) {
		Auto auto = new Auto("BMW", 80, 20);
		Auto sameAuto = new Auto("BMW", 80, 20);
		Auto anotherAuto = new Auto("Audi", 70, 17);
		System.out.println(auto.equals(sameAuto));
		System.out.println(auto.equals(anotherAuto));
		auto.showMark();
		auto.refuel(20.5);
		auto.go();
		auto.refuel(50.5);
		auto.changeWheel();
		auto.go();
		System.out.println(auto);
		System.out.println(auto.hashCode());
	}

}
