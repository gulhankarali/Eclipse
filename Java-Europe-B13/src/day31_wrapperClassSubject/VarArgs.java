package day31_wrapperClassSubject;

public class VarArgs {
	
	public static void main(String[] args) {
		
		sum(2,3);
		sum(334,2,4);
		
		//variable arguments
	}

	private static void sum(int... numbers) {
		
		int sum =0;
		
		for (int value: numbers) {
			
			sum=sum+value;
		}
		
		System.out.println(sum);
		
	}

}
