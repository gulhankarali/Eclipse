package day40_methodHiding;

public class TestBedroom {

	public static void main(String[] args) {
		
		Wall wall1= new Wall("north");
		Wall wall2= new Wall("south");
		Wall wall3= new Wall("east");
		Wall wall4= new Wall("west");
		
		Ceiling ceiling= new Ceiling (300, "white");

		Bed bed= new Bed("victorian", 2,50, 1,2);
		
		Lamp lamp = new Lamp("Edwardian", 4,99);
		
		Bedroom bedroom= new Bedroom("Gulhan", wall1,wall2,wall3,wall4, ceiling, bed, lamp);
		
		bedroom.makeBed();
		
		bedroom.getBed().make();

		bedroom.getLamp().turnOn();
	}

}
