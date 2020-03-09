package day8_control_flow_statements;

public class Task39SwitchFinalStatement {

	public static void main(String[] args) {

		char code ='r';
		
		switch (code) {
		
		case 'R': 
		case 'r': 
			System.out.println("Red");
			break;
		case 'O': 
		case 'o': 
			System.out.println("Orange");
			break;
		case 'G': 
		case 'g': 
			System.out.println("Green");
			break;
		default:
			break;
		
		}
		
		int gg=0, jj=0;
		boolean t= true, r;
		
		r= (t &&  1<(gg+=1));
	//	System.out.println(gg);
		
		r= (t &&  1<(gg+=2));
		System.out.println(gg);
        
		r= (t ||  1<(jj+=1));
		System.out.println(gg);
		
		r= (t ||  1<(jj+=2));
		System.out.println(gg);
		
		int yyy=4;
		boolean ddd= 67<78;
		if (true)
			if (4==(yyy+=1))
			{				System.out.println(true);
		System.out.println(yyy);}
				else {
					System.out.println(false);
		System.out.println(yyy);
				}
		
		final String lastName="Smith";
		String firstName="Mike";
		int id=0;
		
		
		switch(firstName) {
		case "Test":
			System.out.println("Test");
			break;
		case lastName:
			id=5;
			break;
		default: 
			break;
		}
	}

}
