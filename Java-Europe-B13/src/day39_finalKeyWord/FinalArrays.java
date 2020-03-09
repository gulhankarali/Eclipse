package day39_finalKeyWord;

public class FinalArrays {
	
	public static void main(String[] args) {
		
		
		final int[] TEAMS= {11,11};
		System.out.println(TEAMS[0]);
		System.out.println(TEAMS[1]);
		
		TEAMS[0]=10;
		TEAMS[1]=9;
		
		int[] num= {23,222,23333};
		num= new int[] {23,33,3333,222};
		
		final int[] finalNums= {22,333,44,5555};
		finalNums[0]=120;
		finalNums[1]=1120;
	//	finalNums = new int[] {1,2,3,4};
				
				
	}

}
