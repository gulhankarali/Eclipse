package day39_finalKeyWord;

public class Car extends Vehicle{
	
	private int wheels;
	private int doors;
	private boolean isManual;
	private int gears;
	private int currentGear;
	
		public Car(String name, String size, int currentVelocity, int currentDirection, int wheels, int doors,
			boolean isManual, int gears, int currentGear) {
		
		super(name, size, currentVelocity, currentDirection);
		this.wheels = wheels;
		this.doors = doors;
		this.isManual = isManual;
		this.gears = gears;
		this.currentGear = currentGear;
		}
		public void changeGear(int currentGear) {
			this.currentGear=currentGear;
			System.out.println("Car change gear change to "+ this.currentGear+ " gear");
		}
		
		public void changeVelocity(int speed, int direction) {
			move(speed,direction);
			System.out.println("Car change velocity "+ speed + " direction "+ direction);
			
		}
		@Override
		public String toString() {
			return "Car [wheels=" + wheels + ", doors=" + doors + ", isManual=" + isManual + ", gears=" + gears
					+ ", currentGear=" + currentGear + "]";
		}
		
		
	
}
