package day8_control_flow_statements;

public class Task37 {

	public static void main(String[] args) {
		
		
		String model= "dell";
		
		switch (model) {
		
		case "acer":
			System.out.println("Not recommended");
			break;
		case "apple":
			System.out.println("Apple no virus");
			break;
		case "dell":
			System.out.println("tough one");
			break;
		default:
			System.out.println("do not buy that one");		
		}

	}

}
