package day16_classObjects;

public class Car {

	String make;
	int currentSpeed;
	String model;
	String colour;
	
	public void printCarInfo () {
		
		String info = "Car make "+ make + ", model "+ model+ ", colour "+ colour + ", current speed "+ currentSpeed;
		
		System.out.println(info);
	}
	
	public void drive () {
		
		System.out.println(make+ model +" is driving");
	}

	public void accelerate (int mph) {
	
		currentSpeed = currentSpeed+mph;
	
    }
	
}
