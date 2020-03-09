package day33_class_objects;

public class Student {

	String name;
	int age;
	char gender;
	int year;
	String course;
	String university;
	
	public Student(String name, int age, char gender, int year, String course, String university) {
		this.name=name;
		this.age=age;
		this.gender= gender;
		this.year=year;
		this.course= course;
		this.university= university;
	}
	
	public void attendLecture() {
		System.out.println(name +" attending the course");
	}
	public void submitAssingment() {
		System.out.println(name+" submitting the assignment");
	}
	public void attendLab() {
		System.out.println(name+ " attending the lab");
	}
	
}
