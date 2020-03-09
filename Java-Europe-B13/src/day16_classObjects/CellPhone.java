package day16_classObjects;

public class CellPhone {

	
	String brand;
	int screenSize;
	String colour;
	double price;
	
	
	
	public void call(long telNumber) {
		
		System.out.println("Telephone is calling "+ telNumber);
	}
	
	public void message(long telNumber) {
		
		System.out.println("Telephone is messaging "+ telNumber);
	}
	
	public void  takePhoto() {
		
		System.out.println("Telephone is taking photo");
	}
	
}
