package day7_control_flow_statements;

public class Task28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double price=800.0, revenue, discount=0;
		
		int quantity = 7;
		
		revenue= price*quantity;
		
		if (revenue > 5000) {
		   discount = revenue*0.1;
		   revenue = revenue - discount;
		}
		
		System.out.println("Discount is " + discount + " Net revenue "+ revenue);
	}

}
