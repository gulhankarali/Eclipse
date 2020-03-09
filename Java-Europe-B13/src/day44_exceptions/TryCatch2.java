package day44_exceptions;

public class TryCatch2 {

	public static void main(String[] args) {

		int[] nums= {23,34,45,56,67};
		
		System.out.println(nums[2]);
		
		try 
		{
			System.out.println(nums[6]);
		}
		catch (Exception e){
			System.out.println("wrong index");
		}
				

		try {
			int j= 100;
			
			j= j/0;
			
		}
		catch (ArithmeticException e) {
			
			System.out.println("divicde by zero"); 
			
			e.getStackTrace();
			
			System.out.println(e.getMessage());
		}
	}

}
