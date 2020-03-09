package day34_contractorsEncapsulation;

public class Carpet {
	
	static double cost;
	
	public Carpet (double cost) {
		
		if (cost<0)
			this.cost= 0;
		else 
			this.cost= cost;
	}
	
	public static double getCost() {

		return cost;
		
		
	}

}
