package task1;

public abstract class Student implements Abiturient {
	
	private String name;
	private String surname;
	private int age;
	private int course;
	
	public Student(String name, String surname, int age, int course) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.course = course;
	}
	
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public int getAge() {
		return age;
	}
	public int getCourse() {
		return course;
	}
	
	public boolean equals(Object object) {
		if(object == this)
			return true;
		if(object != null && object instanceof Student) {
			Student another = (Student) object;
			return name.equals(another.getName()) && surname.equals(another.getSurname()) && age == another.getAge() && course == another.getCourse();
		}
		return false;
	}
	
	abstract public void passExam();
}
