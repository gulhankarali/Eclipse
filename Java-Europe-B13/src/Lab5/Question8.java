package Lab5;

public class Question8 {

	public static void main(String[] args) {

		
		int [] array= {1,4,5,6};
		
		
		System.out.println(findTwoThree(array));

	}

	private static boolean findTwoThree(int[] array) {

		boolean flag = false;
		
		for (int i=0; i<array.length; i++) {
			
			if ((array[i]==2)||(array[i]==3)) {
				
				flag= true;
				
				break;
			}
		
			else 
				
				flag= false;
		}
		
		return flag;
	}

}
