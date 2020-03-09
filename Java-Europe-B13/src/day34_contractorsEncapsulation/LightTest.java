package day34_contractorsEncapsulation;

public class LightTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Creating light object 1");
		Light l1= new Light();
		
		
		System.out.println("creating light object 2");
		Light l2= new Light(250, true);
		

		System.out.println("creating light object 3");
		Light l3= new Light(250, true, "F");
	}

}
