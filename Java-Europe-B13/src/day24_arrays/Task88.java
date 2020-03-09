package day24_arrays;

import java.util.*;

public class Task88 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				String[] cars= new String[7];
				
		        cars[0]="Honda";
		        cars[1]="Toyota";
		        cars[2]="Nissan";
		        cars[3]="BMW";
		       	cars[4]="Mercedes";
		       	cars[5]="Porsche";
		       	cars[6]="Ferrari";
		       	                
		       	
				Scanner scan = new Scanner(System.in);
				
				Random rand = new Random();
				
				System.out.println("Enter your dream car index: ");
				
				int carIndex= scan.nextInt();
				
				double price = 0.0;
				
				switch (cars[carIndex]) {
				
				case "Honda" : 
					
				case 	"Toyota": 
					
				case  "Nissan":
					
					price= rand.nextInt(40000-20000+1)+20000;
					break;
				
				case   "BMW": 
				
				case "Mercedes":
					
					price = rand.nextInt(80000-50000+1)+50000;
					break;
					
				case "Porsche":
					
				case "Ferrari":
					
					price = rand.nextInt(120000-100000+1)+100000;
					break;
					
				default:
					
					break;
				}
				
				
				System.out.println("Your dream car is : "+ cars[carIndex]+" - Price is "+ price);
		
	}

}
