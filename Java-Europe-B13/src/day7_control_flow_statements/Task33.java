package day7_control_flow_statements;

public class Task33 {

	public static void main(String[] args) {
	
		final int PASS_VALUE= 60;
		
		final int DISTINCTION_VALUE = 90;
		
		int mark = 570;
		
		if (mark<PASS_VALUE) {
			System.out.println("FAIL");
		}
		else if (mark>=PASS_VALUE && mark<DISTINCTION_VALUE) {
			System.out.println("PASS");
		}
		else if (mark>=DISTINCTION_VALUE && mark<=100)
			System.out.println("PASS with DISTINCTION");
		else 
			System.out.println("System Error");

	}

}
