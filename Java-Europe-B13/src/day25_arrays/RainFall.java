package day25_arrays;

import java.util.Scanner;

public class RainFall {

	public static void main(String[] args) {

		double[] rainFall=new double[12];
		
		int i=0;
		
		Scanner scan = new Scanner(System.in);
		
		String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
		
		for (String var:months) {
			
			System.out.print(var + " : ");
			
			rainFall[i]= scan.nextDouble();
			
			i++;
		}
		
		System.out.println("The sum of total rain is :" +TotalRainFall(rainFall)+ " inches");
		
		System.out.println("The average of total rain is :" +AverageRainFall(rainFall)+ " inches");
		
		System.out.println("The max rain fall is :" + MaxRainFall(rainFall)+ " inches");
		
		System.out.println("The min rain fall is :" + MinRainFall(rainFall)+ " inches");

	}

	private static double TotalRainFall(double[] array) {
		
		double sum=0.0;
		
		for (int i=0; i<12;i++) {
			
			sum= sum+ array[i];
			
		}
        
		return sum;
		
	}


	private static double AverageRainFall(double[] array) {
		
		double sum=0.0;
		
		for (int i=0; i<12;i++) {
			
			sum= sum+ array[i];
			
		}
        
		return sum/12.0;
		
	}
	
	private static double MaxRainFall(double[] array) {
		
		double max=0.0;
		
		for (int i=0; i<12;i++) {
			
			if (array[i]>max)
				
				max = array[i];
			
		}
        
		return max;
		
	}

	private static double MinRainFall(double[] array) {
	
		double max= MaxRainFall(array);
		
		double min=max;
		
		for (int i=0; i<12;i++) {
			
			if (array[i]<min)
				
				min = array[i];
		}
        
		return min;
		
	}

}
