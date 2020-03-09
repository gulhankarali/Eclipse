package Lab5;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] array= {5,6,7,8,6,9,0};
		
		
		System.out.println(FindSix(array));
		
	}

	private static boolean FindSix(int[] array) {
		
		boolean flag= false;
		
		for (int i =0; i<array.length; i++) {
		
			if (((i==0)&&(array[i]==6)) || ((i==array.length-1) && (array[i]==6))) {
				
				flag= true;
				
				break;
			}
			else {
					
			    flag= false;
			}
		}
		return flag;
	}

}
