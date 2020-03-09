package day39_finalKeyWord;

import java.util.ArrayList;

public class FinalArrayList {

	public static void main(String[] args) {
		
		final ArrayList<String> COLORS= new ArrayList<>();
		COLORS.add("orange");
		COLORS.add("white");
		COLORS.add("red");
		
	//	COLORS = new ArrayList<String>(); you cannot refer to different object 
		COLORS.add("yellow");

	}

}
