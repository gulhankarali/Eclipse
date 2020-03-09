package day8_control_flow_statements;

public class SwitchCaseStatement {

	public static void main(String[] args) {
		
		String weather = "snowy";
		
		switch (weather) {
		
		case "sunny":
			System.out.println(weather);
			break;
		case "hot":
			System.out.println("today is hot");
			break;
		case "cold":
			System.out.println("today is cold");
			break;
		
		case "snowy":
			System.out.println("today is snowy");
		default:
			System.out.println("today");
		case "rainy":
			System.out.println("today is rainy");
	   
		}
		
	}

}
