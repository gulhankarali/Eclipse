package day36_static_class_members;

public class CountableTest {

	public static void main(String[] args){
		
		int objectCount;
		
		Countable c1= new Countable();
		Countable c2= new Countable();
		Countable c3= new Countable();
		
		objectCount=c1.getInstanceCount();
		
		System.out.println(objectCount);
						
	}
}
