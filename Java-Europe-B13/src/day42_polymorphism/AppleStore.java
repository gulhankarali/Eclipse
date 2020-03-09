package day42_polymorphism;

public class AppleStore {

	public static void main(String[] args) {

		AppleDevice mac = new Mac();
		
		mac.use();

	//	mac.code(); error
		
		Mac myMac= new Mac();
		
		myMac.code();
		
		AppleDevice watch= new AppleWatch();
		
		watch.use();	
		}

}
