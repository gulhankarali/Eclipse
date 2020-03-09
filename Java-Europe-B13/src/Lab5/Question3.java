package Lab5;

public class Question3 {

	public static void main(String[] args) {
		
		
		int [] array1= {0,2,3};
		
		int [] array2= {0,1,2,3,4};
		
		System.out.println(CheckArrays(array1, array2));
	}

	private static boolean CheckArrays(int[] array1, int[] array2) {
		
		if ((array1.length>1)&&(array2.length>1)) {
		
			if ((array1[0]==array2[0])||(array1[array1.length-1]==array2[array2.length-1]))
				
				return true;
			else 
				
				return false;
		}
		
		else {
			if (array1.length<2)
				
				System.out.println("array1 is not valid");
			else 
				System.out.println("array2 is not valid");
		
		return false;
		}
	}

}
