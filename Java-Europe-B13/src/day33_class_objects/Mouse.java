package day33_class_objects;

public class Mouse {

	int numTeeth;
	int numWhiskers;
	int weight;
	
	public Mouse (int weight) {
		this(weight, 16);
		
		System.out.println("Hello, do you  like java?");
	}
	
	public Mouse (int weight, int numTeeth) {
		this(weight, numTeeth,6);
		System.out.println("Hello, who I am?");
	}
	public Mouse(int weight, int numTeeth, int numWhiskers) {
		this.numTeeth = numTeeth;
		this.numWhiskers = numWhiskers;
		this.weight = weight;
		System.out.println("I love constructers");
		
	}
	
	public void print () {
		System.out.println(weight+ " "+ numTeeth+" "+numWhiskers);
	}
	
}
