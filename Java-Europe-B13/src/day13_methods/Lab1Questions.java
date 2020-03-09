package day13_methods;

public class Lab1Questions {

	public static void main(String[] args) {
		
		
		specialEleven(11);
		
		stringTimes("Hi", 3);

		love6(2,4);
		
		deerPlay(95, true);
		
		caughtSpeeding(65, true);
		
		cigarParty(70, true);
		
	}

	private static void cigarParty(int cigar, boolean isWeekend) {
		
		
		if (isWeekend) {
			
			if (cigar>=40) {
				
				System.out.println("True");
			
			}else {
			
				System.out.println("False");
			}
		} else {
			
			if (cigar >=40 && cigar<=60) {
			
				System.out.println("True");
			
			} else 
			
				System.out.println("False");
		}
	}

	private static void caughtSpeeding(int speed, boolean isBirthday) {
		
		int ticket= 0;
		
		if (isBirthday) {
			if (speed<=65) {
				ticket=0;
			} else if (speed>65 && speed <=85) {
				ticket =1;
			} else if (speed>85) {
				ticket =2;
			}
		} else 
			if (speed<=60) {
				ticket=0;
			} else if (speed>60 && speed <=80) {
				ticket =1;
			} else if (speed>80) {
				ticket =2;
			}
			
		System.out.println(ticket);
	}

	private static void deerPlay(int i, boolean isSummer) {
		
		if (isSummer) { 
			if (i>60 && i<100) {
				System.out.println("True");
			}
			else 
				System.out.println("False");
		}else 
			if (i>60 && i<90) {
				System.out.println("True");
			} 
			else 
				System.out.println("False");
		
		
	}

	private static void specialEleven(int i) {
		
		if ((i%11==0)||(i%11==1)) {
			System.out.println("True");
		} else { 
			System.out.println("False");
		}
	}

	private static void love6(int i, int j) {
		
		if ((i==6 || j==6)||(i+j==6)||(i-j==6)||(j-i==0)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

	private static void stringTimes(String string, int i) {
		
		for (int j=1; j<=i; j++) {
			
			System.out.print(string);
		}
		
	}

}
