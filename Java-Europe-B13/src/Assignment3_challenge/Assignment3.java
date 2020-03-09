package Assignment3_challenge;

public class Assignment3 {

	public static void main(String[] args) {
		
		double retailPrice = 99;
		
		double totalSale = 0;
		
		int discount= 0;
		
		double totalDiscount=0;
		
		int quantity=1;
		
		if (quantity<10) 
			
			discount = 0;
			
		else if (quantity>=10 && quantity<=19)
		
			discount = 20;
		
		else if (quantity>=20 && quantity<=49)
		
			discount = 30;     
		
		else if (quantity>=50 && quantity<=99)
	
			discount = 40;
		
		else if (quantity>=100)
			
			discount =50;
        
		
		totalDiscount= retailPrice*quantity*(discount/100);
		
		totalSale= retailPrice*quantity - totalDiscount;
						
		
		System.out.println(" Your discount level : % "  + discount);
		
		System.out.println(" Your purchase after discount : £ "+ totalSale);
	
	}

}
