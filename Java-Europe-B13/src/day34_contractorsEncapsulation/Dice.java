package day34_contractorsEncapsulation;

import java.util.Random;

public class Dice {

	private int sides;
	
	private int value;
	
	private final int SAYI=10;
	

	
	public Dice (int numsides) {
		
		sides = numsides;
	
		roll();
	}
	
	public void roll() {
		
		Random rand= new Random();
		
		value = rand.nextInt(sides)+1;	
		
	}

	
	public int getSAYI() {
		
		return SAYI;
	}

	public int getSides() {
		
		return sides;
	}
	
	public int getValue() {
		
		return value;
	}
	 
}
