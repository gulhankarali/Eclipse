package day40_methodHiding;

public class TestPc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dimensions dimensions= new Dimensions(20, 20, 5);
		
		Case theCase = new Case ("220B", "Dell", "240", dimensions);

		
		
		Monitor theMonitor =new Monitor("D","DEll",26 , new Resolution(1200,1400));
		
		MotherBoard motherBoard = new MotherBoard("HEC", "Asus",4,6,"V33.2");
		
		PC pc= new PC(theCase, theMonitor, motherBoard);
		
		pc.getMonitor().drawPixel(100,299, "blue");
		
		pc.getMotherBoard().loadProgram("java");
		
		pc.getTheCase().pressPowerButton();
	
	}

}
