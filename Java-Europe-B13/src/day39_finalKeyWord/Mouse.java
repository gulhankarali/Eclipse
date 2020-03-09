package day39_finalKeyWord;

public class Mouse extends Rodent{
	protected int tailLenght= 8;
	
	public void getMouseDetails() {
		System.out.println("tail "+tailLength+ " parentTail "+ super.tailLength);
	}

}
