package Repl;

import java.util.List;
import java.util.function.Predicate;
import java.util.ArrayList;
import java.time.LocalTime;
	 
public class Calculator {
//    int num = 100;
//    public void calc(int num) {
//        this.num = num * 10;
//    }
//    public void printNum() {
//        System.out.println(num);
//    }
//    public static void main(String[] args) {
//        Calculator obj = new Calculator();
//        obj.calc(2);
//        obj.printNum();
//    }
	public static void main(String [] args) {
		Double number= Double.valueOf("120D");
		System.out.println(number);
	
		StringBuilder sb= new StringBuilder(5);
		//sb.substring(1);
		System.out.println(sb);
		sb.delete(0,sb.length());
		
		int x=100;
		int a=x++;
		int b= ++x;
		int c= x++;
		int d= (a<b)?(a<c)?a:(b<c)?b:c:a;
		System.out.println(d);
		List names= new ArrayList<>();
		names.add("Greg");
		if (names.remove("Greg")) {
			names.remove("Jon");
		}
		
		int [][] array= new int[1][3];
		System.out.println(array.length);
		message();
		message();
		int j=20;
		int i=10;
		int k=j+=i/5;
		System.out.println(i+" "+j+" "+k);
		LocalTime time = LocalTime.of(11, 40);
		System.out.println(time);   
        int sayi = 5< 4? (4<3) ? 1 : 2: 3;
 		System.out.println("Sayi "+ sayi);
         
		
 		Integer var=7;
 		
        switch(var) {
            case 7:
                System.out.println("Lucky no. 7");
                break;
            default:
                System.out.println("DEFAULT");
        }
	}	
	public static void message() {
		int count=0;
		count++;
		System.out.println(count);
		
	}

	public static void main(int [] args) {

	}
	
	
	public class Test {
	        
    }
	
}