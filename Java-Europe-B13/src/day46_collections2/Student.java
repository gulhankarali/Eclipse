package day46_collections2;

public class Student implements Comparable<Student> {

	private int id;
	private String name;

	
	public Student(int id, String name) {

		this.id=id;
		this.name=name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student id"+id+name;
	}

	@Override
	public int compareTo(Student anotherStudent) {
	
		int value=0;
		if (this.id> anotherStudent.id) {
			value=1;
		} 
		else if (this.id< anotherStudent.id) {
			value= -1;
		} 
		else if ( this.id==anotherStudent.id) {
			value= 0;
		}
		return value; 
	}
}
