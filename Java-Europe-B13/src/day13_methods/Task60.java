package day13_methods;

public class Task60 {

	public static void main(String[] args) {
		
		
		calculator(45,22,'/');
		calculator(45,22,'+');
		calculator(45,22,'*');
		calculator(45,22,'-');
		calculator(45,22,'H');

	}

	private static void calculator(double  i, double j, char c) {
		
		double result;
		
		String message=" ";
		
		switch (c) {
		
		case '+':
			result= i+j; 
			message = Double.toString(result);
			break;
		case '-':
			result= i-j;
			message = Double.toString(result);
			break;
		case '*':
			result= i*j;
			message = Double.toString(result);
			break;
		case '/':
			result= i/j;
			message = Double.toString(result);
			break;
		default:
			message= "INVALID OPERATOR";
			break;
		}
		
	
		System.out.println("The result :"+ message);
		
	}

}
