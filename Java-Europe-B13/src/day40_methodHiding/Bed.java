package day40_methodHiding;

public class Bed {
	
	private String style;
	private int pillow;
	private int weighth;
	private int  sheets;
	private int quilts ;
	
	
	public void make() {
	
		System.out.println("Make is by Gulhan");
	}


	public Bed(String style, int pillow, int weighth, int sheets, int quilts) {

		this.style = style;
		this.pillow = pillow;
		this.weighth = weighth;
		this.sheets = sheets;
		this.quilts = quilts;
	}


	public String getStyle() {
		return style;
	}


	public int getPillow() {
		return pillow;
	}


	public int getWeighth() {
		return weighth;
	}


	public int getSheets() {
		return sheets;
	}


	public int getQuilts() {
		return quilts;
	}
	
	
	
	

}
