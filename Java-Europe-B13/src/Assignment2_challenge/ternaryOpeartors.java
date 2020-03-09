package Assignment2_challenge;

public class ternaryOpeartors {

	public static void main(String[] args) {
		String result;
		int score=99;
		
		result = score>60 ? "pass" : "fail";
		
		int x=5;
		
		System.out.println(x > 2 ? x < 4 ? 10 : 8:7);
		
		if (x>2) {
			if (x<4) {
				System.out.println(10);
			}      
			else 
			{	
				System.out.println(8);
			}
		}else 
		{
			System.out.println(7);
		}
		
	}
	
}
