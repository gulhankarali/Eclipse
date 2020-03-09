package day35_encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employee= new Employee();
		
		employee.setName("Mike Smith");
		
		employee.setIdNumber(47899);
		
		employee.setDepartment("Accounting");
		
		employee.setPosition("VP");
		
		System.out.println("Name:\t\t ID Number\t Deparment \tPosition");
		
		String name =employee.getName();
		
		int idNumber= employee.getIdNumber();
		
		String deparment = employee.getDepartment();
		
		String position= employee.getPosition();
		
		System.out.println(name +"\t\t"+ idNumber+ "\t"+ deparment +"\t" +position);
		
		
	}

}
