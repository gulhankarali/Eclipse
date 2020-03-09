package day34_contractorsEncapsulation;

public class Light {

	int noOfWatts;
	boolean indicator;
	String location;

	
	public Light() {
		this(0, false);
		System.out.println("Returning no arg. constractor no1");
		
	}
	
	public Light(int watt, boolean ind) {
		this(watt, ind, "x");
		System.out.println("number 2");
	}
	
	public Light(int noOfWatts, boolean indicator, String location) {
		this.noOfWatts = noOfWatts;
		this.indicator = indicator;
		this.location = location;
		System.out.println("Return from constructer no 3");
		
	}


	

	
}
