package day8_control_flow_statements;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=78, b=10;
		
		double result=0;
		
		String operand="/"; 
		
		switch (operand) {
			
			case "+":
				
				result = a + b;
				break;
				
             case "-":
				
				result = a - b;
				break;
				
             case "*":
 				
 				result = a * b;
 				break;
 				
             case "/":
 				
 				result = a / b;
 				break;
 				
 			default:
 				System.out.println("Invalid operand");
 				break;
 				
		}
		System.out.println(result);

	}

}
