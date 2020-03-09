package day34_contractorsEncapsulation;

public class DiceTest {

	public static void main(String[] args) {
	
		final int SIX_SIDES=6;
		
		final int TWENTY_SIDES= 20;
		
		Dice sixDice= new Dice(SIX_SIDES);
		
		Dice twentyDice= new Dice(TWENTY_SIDES);
		
		RollDice(sixDice);
		
		RollDice(twentyDice);

	}
	
	public static void RollDice (Dice d) {
		
		System.out.println("Rolling the dice "+ d.getSides());
		
		d.roll();
		
		System.out.println("Rolling  "+ d.getValue());
		
		
				
	}

}
