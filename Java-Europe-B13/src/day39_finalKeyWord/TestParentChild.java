package day39_finalKeyWord;

public class TestParentChild {

	public static void main(String[] args) {

		Child s= new Child();

		System.out.println("value of x before increment "+ s.x);
		
		s.increment();
		
		System.out.println("value of x after increment "+ s.x);
	}

}
