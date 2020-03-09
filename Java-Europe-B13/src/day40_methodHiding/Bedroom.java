package day40_methodHiding;

public class Bedroom {
	
	private Wall wall1;
	private Wall wall2;
	private Wall wall3;
	private Wall wall4;
	private Ceiling ceiling;
	private Bed bed;
	private Lamp lamp;
	private String name;
	
  
    
	
	
    public void makeBed() {
    	System.out.println("Bed is made");
    }


	public Wall getWall1() {
		return wall1;
	}


	public String getName() {
		return name;
	}


	public Wall getWall2() {
		return wall2;
	}




	public Wall getWall3() {
		return wall3;
	}




	public Wall getWall4() {
		return wall4;
	}



	public Ceiling getCeiling() {
		return ceiling;
	}




	public Bed getBed() {
		return bed;
	}




	public Lamp getLamp() {
		return lamp;
	}




	public Bedroom(String name, Wall wall1,Wall wall2,Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {

		this.wall1 = wall1;
		this.ceiling = ceiling;
		this.bed = bed;
		this.lamp = lamp;
	}
	
	
	

}
