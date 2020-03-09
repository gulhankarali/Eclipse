package Repl;

import java.util.ArrayList;

public class Main{ 
   
	public int j;
	private static int i = 1; 
    
    public static void main(String argv[]){ 
    /*   Main s = new Main ();  
       System.out.println(s.j);		
       int i = 2; 
      
       s.someMethod();
       String str="banana";
       System.out.println(str.lastIndexOf("a"));
       System.out.println(str.indexOf("a"));
       
       ArrayList<String> list = new ArrayList<>(); 
       list.add("dog"); 
       list.add("cat"); 
       list.add("frog"); 
       System.out.println(list.toString());
       list.contains("cat");
       list.indexOf("cat");
       System.out.println(list.indexOf(1));
       
       StringBuilder sb = new StringBuilder();
       System.out.println(sb.append(34.5));
       System.out.println(sb.deleteCharAt(1));
       System.out.println(sb.toString());
       
       String st = "java2s"; 
       System.out.println(st.replace('a', 'Z').trim().concat("Aa")); 
       System.out.println(st.substring(0, 2)); 
       System.out.println(st); 
       
       boolean t =true;
       if (t == true) {
    	   System.out.println(t);
    	   
    	int [] arr= {1,2,3,4,5,6};
    	System.out.println(arr.length);    	
    	System.out.println(arr instanceof Object);
    	int [][] array = {{1,2,3}, {4,5,6}, {7,8,9}};
    	System.out.println(array[1][2]);
    	
    	int a[][]= new int[3][];
    	a[1]= new int[]{1,2,3};
    	a[2]= new int[] {4,5};
    	System.out.println(a[1][1]);

    	int x=5, j=0;
    	
    	for(int k=0; k<3;)
    	INNER: do {
    	   	k++; 
    		x++;
    		if(x>10) 
    			break INNER;
    		x+=4;
    		j++;
    		
    	} while (j<=2);
    	System.out.println(x);*/
    	
    	int xx = 10;
    	 int y = 2;
    	 try {
    	 for (int z = 2; z >= 0; z--) {
    	 int ans = xx / z;
    	System.out.print(ans+ " ");
    	 }
    	 } catch (Exception e1) {
    	 System.out.println("E1");
    	 } 

       }
    
    public static void someMethod(){ 
       System.out.println(i); 
    } 
    
  } 