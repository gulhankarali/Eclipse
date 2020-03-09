package day39_finalKeyWord;

public class FinalVariables {

	
	public final static int ROADSTER_MAX_RANGE=600;
	
	public final int  MODEL_3_MAX_SPEED;

	public final int MODEL_X_PASSENGERS;
	
	public static final String ADMIN_USERNAME;
	
	
	public static void main(String[] args) {
		
		final int MAX_PASSENGERS_COUNT=5;
		
		final double PI=3.14;
		
		final int SSN;
		
		SSN=123456;
		
		FinalVariables finalVars= new FinalVariables();
		
		System.out.println("Max range for roadster: "+ ROADSTER_MAX_RANGE);
		
	}
	
	static
	{
		ADMIN_USERNAME="abc";
	}
	
	public FinalVariables() {
		MODEL_3_MAX_SPEED=190;
		
		
	}

	{
		MODEL_X_PASSENGERS=0;
		
	}

	/*public FinalVariables(int num) {
		MODEL_3_MAX_SPEED=num;
		
		{
			MODEL_X_PASSENGERS=7;
		}
	}*/

}
