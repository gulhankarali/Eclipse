package Lab5;

public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] array = {9,1,2,3,4,5,6,7};
		
		System.out.println(difference(array));
	}	
	public static int difference(int [] array)	{
		
		int min=0, max=0;
		
		for (int i=0; i<array.length; i++) {
			
			if (array[i]>max) {
				max= array[i];
			}
		}
		
		min = max;
		for (int i=0; i<array.length; i++) {
			
			if (array[i]<min) {
				min=array[i];
			}
		}
		return max-min;	
		
	}

}
