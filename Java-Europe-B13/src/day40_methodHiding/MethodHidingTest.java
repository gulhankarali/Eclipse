package day40_methodHiding;

public class MethodHidingTest {

	public static void main(String[] args) {
		
		Panda.eat();
		Bear.sneeze();
	}

}

class Bear{
	
	public static void eat() {
		System.out.println("Bear is eating");
	}

	public static void sneeze() {
		System.out.println("Bear is sneazing");
	}

	public void hibernate() {
		System.out.println("Bear is hibernating ");
	}

}

class Panda extends Bear{
	
	public static void eat () {
		
		System.out.println("Panda is eating");
	}
	
	public static void sneeze() {
		System.out.println("Panda is sneazing");
		
	}
	@Override
	public void hibernate() {
		System.out.println("Panda is hibernating ");
	}
	
	
}
