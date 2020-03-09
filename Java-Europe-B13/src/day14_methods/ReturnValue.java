package day14_methods;

public class ReturnValue {

	public static void main(String[] args) {

		sum(2,3);
		
		System.out.println(sum(2,3));
		
		int var1 = sum(2,3);
		
		System.out.println(var1);
		

	}

	private static int sum(int i, int j) {
		
		int result;
		
		result = i+j;
		
		return result;
		
		
	}

}
