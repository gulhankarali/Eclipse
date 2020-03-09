package day36_static_class_members;

public class Countable {
	
	
	static int instanceCounting; 

	public Countable() {
	
		instanceCounting++;
		
	}
	public int getInstanceCount() {
		
		return instanceCounting;
	}

}
