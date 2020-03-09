package day15_tasks;

public class Task70 {

	public static void main(String[] args) {
		
		displayHighScorePosition("Mike", 1600);
		displayHighScorePosition("Mike", 800);
		displayHighScorePosition("Mike", 400);
		displayHighScorePosition("Mike", 80);
	}

    public static void displayHighScorePosition(String string, int i) {
	
    	int returnedNumber = calculateHighScorePosition(i);
    	
    	System.out.println(string+ " managed to get into position "+returnedNumber+ " on the score table.");
		
	}

	public static int calculateHighScorePosition(int i) {
		
		if (i>=1000)
			return 1;
		else if ((i>=500)&&(i<1000))
		    return 2;
		else if ((i>=100)&&(i<500))
			return 3;
		else 
			return 4;	
	}

}
