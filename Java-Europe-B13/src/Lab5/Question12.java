	package Lab5;
	
	public class Question12 {
	
		public static void main(String[] args) {
		
			int [] array1 = {0,9,2};
			
			int [] array2= {1,2,3,4,6};
			
			System.out.println(FindOne(array1, array2));
			
	
		}
	
		private static int FindOne(int[] array1, int[] array2) {
		
			int number;
			
			if ((array1[0]==1)&&(array2[0]==1))
			   
					number=2;
			
			else if (array1[0]==1)
				
				number =1;
		
			else if (array2[0]==1)
			
				number =1;
			
			else 
				number=0;
			
			
			return number;
			
			
		}
	
	}
