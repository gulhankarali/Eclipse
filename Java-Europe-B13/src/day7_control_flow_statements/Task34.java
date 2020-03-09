package day7_control_flow_statements;

public class Task34 {

	public static void main(String[] args) {
		
		
		char courseOne='F', courseTwo='D', courseThree='B';
		
		
		if (courseOne=='A'||courseTwo=='A'||courseThree=='A') {
			
			System.out.println("90-100");
		}
	    if (courseOne=='B'||courseTwo=='B'||courseThree=='B') {
			
			System.out.println("80-89");
		}
		if (courseOne=='C'||courseTwo=='C'||courseThree=='C') {
			
			System.out.println("70-99");
		}
		if (courseOne=='D'||courseTwo=='D'||courseThree=='D') {
	
			System.out.println("60-69");
		}
		if (courseOne=='F'||courseTwo=='F'||courseThree=='F') {
	
			System.out.println("0-59");
		}


	}

}
