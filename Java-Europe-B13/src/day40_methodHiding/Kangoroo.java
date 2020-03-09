package day40_methodHiding;

public class Kangoroo extends Marsupial {

	
//	public boolean isBiped() {
		
//		return true;
//	}
	
	public static boolean isBiped () {
			return true;
		}
	
	public void getKangorooDescription() {
		
		System.out.println("Kangoroo hops on two legs "+ isBiped());
	}
}
