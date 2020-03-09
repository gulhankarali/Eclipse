package day39_finalKeyWord;

public class FinalMethods {

	public final void method1()
	
	{
		System.out.println("method 1");
	}
	
	public static void staticMethod(String word) {
		System.out.println("Static Method");
	}
}

class sub extends FinalMethods{
	
	
	public void method1(int x)
		
	{
		System.out.println("method 1");
	}
	
	public static void staticMethod(String word) {
		
		System.out.println("Static method in sub class");
	}
	
}