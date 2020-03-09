package day41_abstraction_interface;

public abstract class Bird extends Animal{

	public Bird(String name) {
		super("Bird");
		
	}


	@Override
	public void eat() {
		System.out.println("Bird is Eating");
		
	}
	

	/*@Override
	public void breathe() {
	
		System.out.println("Breating");
		
	}*/
	
	
	public abstract void fly();
}
