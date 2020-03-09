package Lab5;

import java.util.Arrays;

public class Question29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] array = {30,2,10,2,3,2,3,4,4};
		
		System.out.println(Arrays.toString(TenTimes(array)));
	}

	private static int [] TenTimes(int[] array) {
		
		int tens =0;
		
		for (int i=0; i<array.length; i++) {
			
			if (array[i]%10==0) {
	
				tens = array[i];
		
				for (int j= i+1; j<array.length; j++) {
						
					if ( array[j]%10==0)
						
						break;
					
					else
						
						array[j]=tens;
				
				}
				
			}
		}
		
		return array;
	}

}
