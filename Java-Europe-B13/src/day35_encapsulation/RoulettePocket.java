package day35_encapsulation;

public class RoulettePocket {

	
	private 
	int number;
	
	public RoulettePocket (int number) {
		this();
		this.number=number;
	}
	
	public RoulettePocket() {
		
	}
	
	public String getPocketColour() {
		
		String colour = null;
		
		if (this.number==0)
			
			colour= "green";

		else if  (this.number>=1 &&this.number<=10)
			
				if (this.number%2==0) {
					colour= "black";
				}
				else { 
					colour = "red";
				}
		
		else if  (this.number>=11 &&this.number<=18)
			
			if (this.number%2==0) {
				colour= "red";
			}
			else { 
				colour = "black";
			}
		else if  (this.number>=19 &&this.number<=28)
			
			if (this.number%2==0) {
				colour= "black";
			}
			else { 
				colour = "red";
			}
		else if  (this.number>=29 &&this.number<=36)	
			
			if (this.number%2==0) {
				colour= "red";
			}
			else { 
				colour = "black";
			}
		else colour="invalid";
	
	
		return colour;
		
	}

	public int getNumber() {
		
		return this.number;
	}

	public void setNumber(int number) {
		
		this.number = number;
		if (this.number <0 || this.number>36)
		{
			System.out.println("Error");
		}
		
	}
	
	
	
}
