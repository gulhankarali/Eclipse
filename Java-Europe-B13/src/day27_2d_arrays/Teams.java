package day27_2d_arrays;

import java.util.Arrays;

public class Teams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] team= new String [2][4]; 
		
		team[0][0]= "Mike";
	    team[0][1]= "Tony";
 		team[0][2]="Ali";
	    team[0][3]=	"Veli";
	    
	    team[1][0]= "Mine";
	    team[1][1]= "Ferah";
 		team[1][2]="Kerim";
	    team[1][3]=	"Leyla";
	    
	   
	  
	    
	    String[][] teams= {{"Mike","Tony", "Ali", "Veli"},{"Mine", "Ferah", "Kerim", "Leyla"},{"a","b","c"}};	    
	    
	    for (int i =0; i<team.length;i++) {
	    	for (int j=0; j<team[i].length; j++) {

	    		System.out.println(teams[i][j]);
	    	}
	    }	
	    
	   for (String value: teams[2])
		   
		   System.out.println(value);
	   
	   
	    
	   for (String[] team1: teams) {
		   
		   System.out.print(team1.length);
		   
		   System.out.println(Arrays.toString(team1));
	   }
	   
	   int[][] students= {{4,5},{3,6,7,8,},{10,11,13,24,45,43}};
	   
	   for (int [] value: students) {
		   
		   System.out.println(Arrays.toString(value));
	   }
	   
	   
	   for (int[] group : students) {
		
		   for (int studentId : group  )
		   {
			   System.out.println(studentId);   
		   }
	   }
	   
	   
	   int[][] array = new int [4][];
	   
	   array[0]= new int [3];
	   
	   array[1]= new int[5];
	   
	   array[2]= new int [1];
	   
	   array[3]=new int [2];
	   
	   
	   
	   
	}

}
