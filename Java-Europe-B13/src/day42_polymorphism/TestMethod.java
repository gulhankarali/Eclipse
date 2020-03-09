package day42_polymorphism;

public class TestMethod {

	public static void main(String[] args) {

		childA chA= new childA();
		
		childB chB= new childB();
		
		Parent p1 = new childA();
		
		p1.m1();
		
		Parent p2 = new childB();
		
		p2.m1();
		
		
		myInterface p3= new childA();
		
		p3.m2();
		
		myInterface p4= new childB();
		
		p4.m2();
		
	}

}

class Parent{ 
	
	public void m1() {
		
	}
}

interface myInterface{
	
	public abstract void  m2();
	
}

class childA extends Parent implements myInterface{

	@Override
	public void m2() {
		
	}
	public void m3() {
		
	}
}
class childB extends Parent implements myInterface{

	@Override
	public void m2() {
		
	}
	public void m4() {
		
	}
}