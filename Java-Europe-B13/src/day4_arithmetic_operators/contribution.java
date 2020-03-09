package day4_arithmetic_operators;

public class contribution {

	public static void main(String[] args) {
		
	    double contributionRate;
		double contribution;
		double salary;
		
		salary = 6000;
		
		contributionRate = 0.05;
		
		contribution = salary*contributionRate;
		
		System.out.println("Contribution for 5% is $ " + contribution);
		
        contributionRate = 0.08;
		
		contribution = salary*contributionRate;
		
		System.out.println("Contribution for 8% is $ " + contribution);
		
        contributionRate = 0.10;
		
		contribution = salary*contributionRate;
		
		System.out.println("Contribution for 10% is $ " + contribution);
		
		System.out.println(12 / 3 * 4);
	}
}
