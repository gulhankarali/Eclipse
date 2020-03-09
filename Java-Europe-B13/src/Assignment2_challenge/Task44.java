package Assignment2_challenge;

public class Task44 {

	public static void main(String[] args) {
		
		System.out.println("KPH \t MPH");
		for(int i=60; i<=130; i+=10) {
			System.out.println(i +"\t"+ Math.round(i*0.6214));
			
		}
	}
}
