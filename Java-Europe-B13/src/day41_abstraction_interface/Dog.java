package day41_abstraction_interface;

public class Dog extends Animal{
	
	
	public Dog() {
		super("name");
	}
	
	@Override
	public void eat() {
		
		System.out.println("Eating");
	}

	@Override
	public void breathe() {

		System.out.println("Breathing");
	}
	
	public void bark() {
		
		System.out.println("Barking");
	}

}
