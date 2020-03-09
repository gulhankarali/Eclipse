package day12_control_flow_statements;

public class branchingStatement {

	public static void main(String[] args) {
		
		
		int number =0;
		while (number<15) {
			number ++;
			if (number<=5) {
				System.out.println(number);
				continue;
			}
			System.out.println(number);
			if (number>=10) {
				System.out.println(number);
	            break; 		
			}
		}

	}

}
