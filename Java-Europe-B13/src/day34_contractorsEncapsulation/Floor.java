package day34_contractorsEncapsulation;

public class Floor {

	double width;
	
	double length;
	

	public Floor(double width, double length) {
	
		if (width<0)
			this.width=0;
		else 
			this.width = width;
		if (width<0)
			this.length = 0;
		else 
			this.length=length;
	}
	
	public double getArea() {
		
		return width*length;
	}
	
}
