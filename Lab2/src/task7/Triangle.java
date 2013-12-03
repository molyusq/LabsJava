package task7;

public class Triangle {

	private double[] sides = new double[3];

	public Triangle(double a, double b, double c) throws Exception {
		if (a <= 0 || b <= 0 || c <= 0) {
			throw new Exception("Triangle sides should be positive numbers");
		}
		if (a + b <= c || b + c <= a || a + c <= b) {
			throw new Exception("The triangle cannot be constructed");
		}
		sides[0] = a;
		sides[1] = b;
		sides[2] = c;
	}

	public int getTriangleType() {
		for (int i = 0; i < 3; i++) {
			int next = i + 1;
			if (next == 3)
				next = 0;
			if (sides[i] == sides[next]) {
				int next2 = next + 1;
				if (next2 == 3)
					next2 = 0;
				if (sides[next] == sides[next2]) {
					return 3;
				} else {
					return 2;
				}
			}
		}
		return 1;
	}
}
