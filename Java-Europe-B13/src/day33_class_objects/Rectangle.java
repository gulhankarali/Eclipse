package day33_class_objects;

public class Rectangle {

	
	double width;
	
	double length;
	
	public Rectangle() {
		
		System.out.println("Default constructor");
		
	}
	
	public Rectangle (double w, double l) {
		
		width=w;
		length=l;
		
	}
	
	public void getArea () {
		System.out.println(width*length);

	}

}
