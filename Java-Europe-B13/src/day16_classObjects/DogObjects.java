package day16_classObjects;

public class DogObjects {

	public static void main(String[] args) {

		
		Dog dog1 = new Dog();
		
		dog1.age= 10;
		dog1.breed= "Dalmacian";
		dog1.colour= "White";
		dog1.name="Dali";
		
		System.out.println(dog1.name +" is at age of "+ dog1.age);
		
		dog1.barking();
		dog1.hungry();
		dog1.sleeping();
	}

}
