package day37_inheritance;

public class Company {

	public static void main(String[] args) {
	
		Employee employee= new Employee();
		
		employee.name= "Tom";
		employee.jobTitle= "Teacher";
		employee.age= 27;
		employee.gender='M';
		
		employee.work();
		System.out.println(employee.toString());
		
		employee.eat("Burger");
		
		
				

	}

}
