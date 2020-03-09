package day40_methodHiding;

public class Marsupial {

	//public boolean isBiped()
	//{
	//	return false;
		
//	}
	
	public static boolean isBiped() {
		return false;
		}
	
	public void getMarsupialDescripton() 
	
	{
		System.out.println("Marsupial walks on two legs "+ isBiped() );
	}
}
