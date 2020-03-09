package Assignment3_challenge;

public class Assignment4 {

	public static void main(String[] args) {
	
		
		double weigth = 1.5;
		int miles = 678;
		int countMiles = 0;
		double rate = 0;
		double totalPay=0;
		
		if (weigth <= 2)
			rate =1.1;
		else if (weigth >2 && weigth <=6)
			rate = 2.2;
		else if (weigth >6 && weigth <=10)
			rate = 3.7;
		else if (weigth>10) 
			rate = 3.8;
		
		countMiles = miles / 500;
			
		
		// 500 un kati olmayan mile'lar ve milege'i 500 den kucuk oldugu durumlar exception olusturuyor, onlari kontrol altina
		// almak icin bu kontrolu koydum
		
		if ((miles%500 > 0)||(miles<500))
			countMiles = countMiles+1;
		
		totalPay= countMiles*rate;
	
		
		System.out.println("Shipping charge is : £ " + totalPay);
	}

}
