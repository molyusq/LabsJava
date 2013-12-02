package task1;

public class StudentsTest {

	public static void main(String[] args) {
		StudentOfFaculty student = new StudentOfFaculty("Alexey", "Chernega", 21, 5, "FAM");
		student.showInfo();
		student.passExam();
		StudentOfFaculty sameStudent = new StudentOfFaculty("Alexey", "Chernega", 21, 5, "FAM");
		StudentOfFaculty anotherStudent = new StudentOfFaculty("Alexey", "Sergeev", 21, 5, "IASA");
		System.out.println(student.toString());
		System.out.println(student.equals(sameStudent));
		System.out.println(student.equals(anotherStudent));
		
		
	}

}
