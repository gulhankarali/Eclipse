package day41_abstraction_interface;

public abstract class Animal {
	
	String name;
	
	public Animal(String name) {
	
		this.name =name;
	}

	public abstract void eat();
	
	public abstract void breathe();
	
	public void move() {
	
		System.out.println("Moving");
		
	}
}
