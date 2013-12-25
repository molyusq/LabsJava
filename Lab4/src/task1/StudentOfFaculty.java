package task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentOfFaculty extends Student {
	
	private String facultyName;
	
	public StudentOfFaculty(String name, String surname, int age, int course, String facultyName) {
		super(name, surname, age, course);
		this.facultyName = facultyName;
	}
	
	public void showInfo() {
		System.out.println("Name: " + getName());
		System.out.println("Surname: " + getSurname());
		System.out.println("Age: " + getAge());
		System.out.println("Course: " + getCourse());
		System.out.println("Faculty: " + facultyName);
	}
	
	public void passExam() {
		System.out.println("Student " + getName() + " " + getSurname() + " from " + getFacultyName() +  " passed the exam.");
	}
	
	public String getFacultyName() {
		return facultyName;
	}
	
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}
	
	@Override
	public Object[] getObjectData(){
		List<Object> list = new ArrayList<Object>(Arrays.asList(super.getObjectData()));
	    list.addAll(Arrays.asList(new Object[]{ facultyName}));
		return list.toArray();
	}
	
	public boolean equals(Object object) {
		if(object == this)
			return true;
		if(object != null && object instanceof Student) {
			StudentOfFaculty another = (StudentOfFaculty) object;
			return super.equals(another) && facultyName.equals(another.getFacultyName());
		}
		return false;
	}
	
	public String toString() {
		return getClass().getName() + " [name=" + getName() + ", surname=" + getSurname() + ", age=" + getAge() + ", course=" + getCourse() + ", facultyName=" + facultyName + "]";
	}
}
