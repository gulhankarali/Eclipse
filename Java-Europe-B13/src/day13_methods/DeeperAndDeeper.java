package day13_methods;

import javax.sound.midi.Soundbank;

public class DeeperAndDeeper {

	public static void main(String[] args) {
		
		System.out.println("I m starting in main");
	    deep();  	
		System.out.println("I m back in main again");
	}

	private static void deep() {
		
		System.out.println("I m in deep");
		deeper();
		
		System.out.println("I m back in deep again");
	}

	private static void deeper() {
		System.out.println("I m in deeper");
		
	}
	
	
	

}
