package day2_printing_comments;

import java.text.SimpleDateFormat;
import java.util.Date;


public class gasReceipt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date = new Date();
		SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		
		System.out.println("+-----------------------------+");
		System.out.println("|      MCLEAN STORE           |");
		System.out.println("|                             |");
		System.out.print("|     ");
		System.out.print(formatDate.format(date));
		System.out.println("     |");
		System.out.println("|                             |");
		System.out.println("|   Gallons:          10.870  |");
		System.out.println("|                             |");		
		System.out.println("|   Price/gallon:     $2.089  |");
		System.out.println("|                             |");
		System.out.println("|   Fuel total:      $22.710  |");
		System.out.println("|                             |");
		System.out.println("+-----------------------------+");
		

	}

}
