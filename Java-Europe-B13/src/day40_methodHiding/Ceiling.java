package day40_methodHiding;

public class Ceiling {

	private int heigth;
	private String paintedColour;

	
	public Ceiling(int heigth, String paintedColour) {

		this.heigth = heigth;
		this.paintedColour = paintedColour;
	}


	public int getHeigth() {
		return heigth;
	}


	public String getPaintedColour() {
		return paintedColour;
	}
	
	
}
