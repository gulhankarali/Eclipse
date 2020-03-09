package day38_inheritance_part2;

public class StaticTest {

	public static void main(String[] args) {

		StaticSub object= new StaticSub();
		object.num=5;
		object.print();
		
		StaticSuper.num=10;
		object.print();
		
		object.m2();

	}

}
