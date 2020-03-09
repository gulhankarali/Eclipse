package day15_tasks;

public class Task69 {

	public static void main(String[] args) {

		System.out.println(primeNumber(121));

		System.out.println(primeNumber(19));
	}

	public static boolean primeNumber(int number) {
		
		
		if ((number ==0 )||(number==1)) {
	
			return false;
			
		} else 
		
		{	
			for (int i=2; i<number; i++) {
			
				if ((number%i)==0) {
		
					return false;
			
				}	
			}
		
		}
		
		return true;
		
		
	}
}
