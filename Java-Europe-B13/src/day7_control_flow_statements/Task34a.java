package day7_control_flow_statements;

public class Task34a {

	public static void main(String[] args) {
		
		int x=36, y=49, z=56;
		
		double average = (x+y+z)/3;
		
		System.out.println(average);
		
		if (average <= 100 && average >=90)
			System.out.println("A");
		else if (average <= 89 && average >=80)
			System.out.println("B");
		else if (average <= 79 && average >=70)
			System.out.println("C");
		else if (average <= 69 && average >=60)
			System.out.println("D");
		else if (average <=59)
			System.out.println("F");
	}
}
