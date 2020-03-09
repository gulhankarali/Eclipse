package Lab5;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array= {1};
		
		System.out.println(CheckEquals(array));
	}

	private static boolean CheckEquals(int[]array) {
		
		boolean flag= false;
		
		for (int i =0;i<array.length; i++) {
			
			int temp= array[0];
			
			if (array.length>1) {
				
				
				if ((i==array.length-1) && (array[i]==temp)) {
				
					flag=true;
		
					break;	
				}
					else 
					
					flag = false;
				}
			else {
				
				System.out.println("Not a valid array!");
				
				flag= false;
			
			}
	
		}
		return flag;
	}

}
