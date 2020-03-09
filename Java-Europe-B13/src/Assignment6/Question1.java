package Assignment6;

public class Question1 {

	public static void main(String[] args) {
		
		printArray(1000);
		
	}
	
	public static void printArray(int size) {

		int i=0;
		
		for( int value: createArray(size)) {
			
			System.out.print(value+" ");
			
			i++;
			
			if (i%10==0)
				
				System.out.println();	
		}
		
	}

	private static int[]  createArray(int size) {
		
		int [] array= new int[size];
		
		for (int i=0; i<1000; i++)
			
			array[i]=i+1;
		
		return array;
	}
		


}
