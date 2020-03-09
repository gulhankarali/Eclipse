package day40_methodHiding;

public class Lamp {
	
	private String style;
	private int battery;
	private int globalRating;
	
	
	public void turnOn() {
		
		System.out.println("the lamp is turned on");
	}


	public Lamp(String style, int battery, int globalRating) {
	
		this.style = style;
		this.battery = battery;
		this.globalRating = globalRating;
	}


	public String getStyle() {
		return style;
	}


	public int getBattery() {
		return battery;
	}


	public int getGlobalRating() {
		return globalRating;
	}

	
}
