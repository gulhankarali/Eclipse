package day7_control_flow_statements;

public class smallTask2 {

	public static void main(String[] args){

      int x=100, y;
		
		if (x>100) {
			y=20;
		} else {
			y=0;
		}
        System.out.println(y);
        
        y=100;
        
        if (y==100){
        	x=1;
        }else { 
        	x=0;
        	}
        System.out.println(x);
        
        int a=8, b, c;
        if (a<10) {
        	b=0;
        	c=1;
        } else {
        	b= -99;
        	c=0;
        }
        System.out.println("b "+b + " c "+ c);
	}

}
