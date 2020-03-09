package day34_contractorsEncapsulation;

public class CarpetTest {

	public static void main(String[] args) {

		Carpet carpet= new Carpet(7);
		
		Floor floor= new Floor(3,70);
		
		Calculator calculator=new Calculator(floor, carpet);
		
		System.out.println(calculator.getTotalCost());
		
		

	}

}
