package task7;

public class Task7Test {
	public static void main(String[] args) {
		int filter = -1;
		String sides;
		Triangle t;
		for (int a = -1; a < 10; a++) {
			for (int b = -1; b < 10; b++) {
				for (int c = -1; c < 10; c++) {
					sides = a + ", " + b + ", " + c;
					try {
						t = new Triangle(a, b, c);
						int type = t.getTriangleType();
						if ((filter == -1) || (filter == type))
							System.out.print(sides + ": " + type + "\r\n");
					} catch (Exception e) {
						if (filter <= 0)
							System.err.print(sides + ": 0" + "\r\n");
					}
				}
			}
		}
	}
}
