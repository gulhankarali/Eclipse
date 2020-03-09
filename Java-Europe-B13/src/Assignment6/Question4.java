package Assignment6;

public class Question4 {

	public static void main(String[] args) {
		
		short arrays[]= new short[] {51, 85, 32, 0, 98, 157, 82, 101, 64, 249};
		
		for (short value: arrays) {
			
			if ((value>=50)&&(value<100))
				
				System.out.println(value +" ==> Half century");
			
			else if ((value>=100)&&(value<200))
				
				System.out.println(value +" ==> Century");
			
			else if (value>=200)
				
				System.out.println(value +" ==> Double century");
			
		}
			
	}

}
