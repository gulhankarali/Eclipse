package Lab4;

import java.util.Random;


public class Task84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int number = 0;
		
		Random rn = new Random();
		
	 for (int i = 1; i<=10;i++) {
		
		 number=rn.nextInt(2);
	 
	 	 if (number==1)
	 		 
	 		 System.out.println("heads");
	 	 else 
	 		 System.out.println("tails");
	 	}
	}

}
