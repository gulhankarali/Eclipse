package day15_tasks;

public class Task67 {

	public static void main(String[] args) {
		
		if (lastDigit(3049,383)) 
			
			System.out.println("They have the same last digit");
		else 
			System.out.println("They don't have the same last digit");
		
	}

	public static boolean lastDigit(int i, int j) {
		
			i=i%10;
			
			j=j%10;
			
		
		if (j==i) {
			
			return true;
			
		} else { 
		
	
			return false;
	    }
	}

}
