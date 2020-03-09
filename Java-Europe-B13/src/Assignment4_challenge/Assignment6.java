package Assignment4_challenge;

public class Assignment6 {

	public static void main(String[] args) {
   
		int k; int temp=0;
		
		for (int i= 1; i<= 5; i++) {
			
		   k=4;

		   temp=i;
		    
		   for (int j=1 ; j<=i; j++) {		   
		     	
			   if (j==1)
		     		
		     		System.out.print(i+" ");
		     		
		     	else {
		     		
		     		temp=temp+k;
		     				
		     		System.out.print(temp+" ");
		     		
		     		k=k-1;
		     		
		     	}
			}
			
			System.out.println(" ");
		}
		
	}

}
