package Repl;

import java.util.Arrays;

import java.util.Scanner;

public class JavaOne {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	    
		 boolean [] visited = new boolean[nums.length];
	        for (int i = 0; i <nums.length ; i++) {
	            int x = nums[i];
	            if(visited[i]==false) {
	                boolean isDuplicate = false;
	                for (int j = i + 1; j < nums.length; j++) {
	                    if (x == nums[j]) {
	                        isDuplicate = true;
	                        visited[j] = true;
	                    }
	                }
	                if (!isDuplicate)
	                    System.out.println(x);
	            }
	        }
			    
	}		    
}			    


