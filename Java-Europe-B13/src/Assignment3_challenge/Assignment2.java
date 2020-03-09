package Assignment3_challenge;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int seconds = 86460;
		int minutes = 0;
		int hours   = 0;
	    int days    = 0;
	   
		   
		days= seconds/86400;
		seconds=seconds%86400;
		//System.out.println(seconds);

			   
		hours= seconds/3600;
		seconds=seconds%3600;	
	    //System.out.println(seconds);

			   
		minutes= seconds/60;
		seconds=seconds%60; 
		//System.out.println(seconds);
	   
	   System.out.println(days +" Days " +hours  + " Hours "+ minutes + " Minutes "+ seconds + " Seconds ");
	}

}
