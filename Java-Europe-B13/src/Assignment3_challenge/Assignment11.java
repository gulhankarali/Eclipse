package Assignment3_challenge;

public class Assignment11 {

	public static void main(String[] args) {
		
		int number =4;
		
		switch(number) {
		
		case 0 : case 1 : case 2:
			System.out.println("Low number "+ number);
			break;
		case 3: case 4: case 5: 
			System.out.println("Medium number " +number);
			break;
		default :
			System.out.println("Other number "+number);
		} 
		
	}

}
