package Lab3;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String username="";
		
		if (username.isEmpty())
			System.out.println("username is empty");
		
		username = "eclipse";
		
		System.out.println(username.startsWith("ec"));
		
		System.out.println(username.endsWith("e"));
		
		String addresse="Mrs.Gulhan Balci";
		
		if (addresse.startsWith("Mr."))
			
			System.out.println("Married man");
		
		else if (addresse.startsWith("Mrs."))
			
			System.out.println("Married women");
		
		else if (addresse.startsWith("Ms."))
			
			System.out.println("Some women");
		
		else if (addresse.startsWith("Dr."))
			
			System.out.println("Dr man or women");
		
		else 
			System.out.println("unknown status");
	}

}
