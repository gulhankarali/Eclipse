package day31_wrapperClassSubject;

public class Task96 {

	public static void main(String[] args) {
		
		String str1 = "Today weather is sunny and 72 degree. It is a perfect day to practice java.";
		
		String [] array= str1.split(" ");
		
		double number = Double.parseDouble(array[5]);
		
		double celcius= Math.round((number-32.0)* 5.0/9.0);
		
		System.out.println(number + " degree is equal to "+celcius + " celcius");
	}

}
