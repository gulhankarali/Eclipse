package day33_class_objects;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1= new Student("Mike",17, 'M', 2016, "Java", "Cybertek");
		Student s2= new Student("Smith", 25, 'M', 1999, "JS", "Cybertek");
		s1.attendLecture();
		s2.attendLab();
	}

}
