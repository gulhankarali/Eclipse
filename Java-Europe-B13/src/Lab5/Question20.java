package Lab5;

public class Question20 {

	public static void main(String[] args) {

		int[] x = {1,2,2,6,99,99,2};
	
		boolean boolCheckTwo = false;
		
		for(int i=0;i<x.length-1;i++) {
			
			if((x[i] ==2 )&&(x[i+1]==2)) {
				
				boolCheckTwo= true;
					
				break;	
			}
		}
		
		System.out.println(boolCheckTwo);
	}

}
