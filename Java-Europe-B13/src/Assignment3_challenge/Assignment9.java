package Assignment3_challenge;

public class Assignment9 {

	public static void main(String[] args) {
		
		
		int points=0;
		int numberOfBooks=5;
		
		switch (numberOfBooks) {
		case 0:
			points = 0;
			break;
		case 1:
			points = 5;
			break;
		case 2:
			points = 15;
			break;
		case 3:
			points = 30;
			break;
		case 4:
			points = 60;
			break;
		default  :
			points = 60;
			break;
		
		}
		
		System.out.println("The customer has bought "+numberOfBooks +" and they collected "+ points+ " points");

	}

}
