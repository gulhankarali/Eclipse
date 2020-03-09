package Assignment3_challenge;

public class Assignment13 {

	public static void main(String[] args) {
	
		int n =10; int fib1=0, fib2=0, fibb=0;
	
		
		
		fib1=0; fib2=1;
		
		for (int i=1; i<n; i++) {
			
            System.out.print(fib2);
			
			System.out.print(" ");
			
			fibb=fib1+fib2;	
			
			fib1=fib2;
		
			fib2=fibb;
		
			
			
		}

	}

}
