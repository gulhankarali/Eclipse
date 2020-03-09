package Repl;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedSet;
import java.util.TreeSet;

public class Odev {
	static Boolean[] arr = new Boolean[1]; 
	static Double d1=10.0;
    static int x = d1.intValue();
    @Override
    public String toString() {
        return "TEST";
    }

	
	public static void main(String[] args) {
		final int i1 = 1;
        final Integer i2 = 1;
        final String s4 = ":ONE";
        
        String str5 = i1 + s4;
        String str6 = i2 + s4;
        
        System.out.println(str5 == "1:ONE");
        System.out.println(str6 == "1:ONE");
		
		String msg1 = "Hello";
        boolean [] flag = new boolean[1];
        if(flag[0]) {
            msg1 = "Welcome";
        }
        System.out.println(msg1);
        
		
		LocalDate date3 = LocalDate.parse("2000-06-25");
     
		
		System.out.println("Hello");;;;;;;;;
	//	System.out.println(LocalDate.parse("1987-09-01").format(
      //          DateTimeFormatter.ISO_DATE_TIME));
		
		List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("grape");
        fruits.add("mango");
        fruits.add("banana");
        fruits.add("grape");

        if(fruits.remove("grape"))
            fruits.remove("papaya");

        System.out.println(fruits);
        
		byte [] arr2 = new byte[0];
     //   System.out.println(arr2[0]);
		
		List<StringBuilder> dryFruits = new ArrayList<>();
        dryFruits.add(new StringBuilder("Walnut"));
        dryFruits.add(new StringBuilder("Apricot"));
        dryFruits.add(new StringBuilder("Almond"));
        dryFruits.add(new StringBuilder("Date"));

        for(int i = 0; i < dryFruits.size(); i++) 
        {
            if(i == 0) {
                dryFruits.remove(new StringBuilder("Almond"));
            }
         }

        System.out.println(dryFruits);
		int $ = 80000;
        String msg = ($ >= 50000) ? "Good bonus" : "Average bonus";
        System.out.println(msg);
		
		List<Integer> list1 = new ArrayList<>();
        list1.add(110);
        list1.add(new Integer(110));
        list1.add(110);

        list1.removeIf(i -> i == 110);
        System.out.println(list1);
		
		 String [] arr = new String[1];
	  //      System.out.println(arr[0].isEmpty());
	        
		int start = 1;
        int sum = 0;
        do {
            if(start % 2 == 0) {
                continue;
            }
            sum += start;
        } while(++start <= 10);
        System.out.println(sum);
		
		for1:
	         for (int i = 2; i <= 100; i = i + 2) {
	             for(int j = 1; j <= 10; j++) {
	                 System.out.print(i * j + "\t");
	             }
	             System.out.println();
	             if(i == 10) {
	                 break for1;
	             }
	         }
	
		List<String> trafficLight = new ArrayList<>();
	     trafficLight.add(0, "R");
		trafficLight.add(1, "RED");
        trafficLight.add(2, "ORANGE");
        trafficLight.add(3, "GREEN");

        trafficLight.remove(new Integer(2));

        System.out.println(trafficLight);
	
		 List<Boolean> list = new ArrayList<>();
         list.add(true);
         list.add(new Boolean("tRue"));
         list.add(new Boolean("abc"));
 
         if(list.remove(1)) {
             list.remove(1);
         }
 
         System.out.println(list);
		int a = 20;
        int var = --a * a++ + a-- - --a;
        System.out.println("a = " + a);
        System.out.println("var = " + var);
		Odev obj1 = new Odev();
	         System.out.println(obj1);
		
		LocalDate date2 = LocalDate.of(2020, 9, 6);
        System.out.println(date2);
		
	    LocalDate date1 = LocalDate.of(2000, Month.JANUARY, 1);
        Period period = Period.parse("p-30000y");
        System.out.println(date1.plus(period)+"D");
        
		String str1 = "Java Rocks!";
        System.out.println(str1.length() + " : " + str1.charAt(10));
		
		System.out.println(x);
		// TODO Auto-generated method stub
		Map<String, Integer> map= new HashMap<>();
		
		map.put("14", 14);
		map.put("1", 1);
		map.put("5", 5);
		map.put("34", 34);
		map.put("-1", -1);
		map.put("19", 19);
		map.put("34", 34);
		
		int min= minvalue(map);
		
		System.out.println(min);
		
		String str="abcdefaabcccdef";
		
		System.out.println(str.toCharArray());
		
		System.out.println(FrequencyTest(str));
		
		System.out.println(sortByValue(map));
		
		StringBuilder sb1 = new StringBuilder(100);
        System.out.println(sb1.length() + ":" + sb1.toString());
        
        StringBuilder sb = new StringBuilder("Java");
        String s1 = sb.toString();
        String s2 = "Java";

        System.out.println(s1 == s2);
        LocalDate date = LocalDate.parse("2018-06-06");
        date.minusDays(10);
        System.out.println(date);
        Error obj = new Error();
     //   boolean flag1 = obj instanceof RuntimeException; //Line n1
      //  boolean flag2 = obj instanceof Exception; //Line n2
        boolean flag3 = obj instanceof Error; //Line n3
        boolean flag4 = obj instanceof Throwable; //Line n4
        System.out.println(flag3 + ":" + flag4 + ":" + flag3 + ":" + flag4);	 
        
        int i = 5;
        if(i++ < 6) {
            System.out.println(i++);
        }
        
       
		
		
	}
	
	public static int minvalue(Map<String, Integer> map) {
		SortedSet<Integer> sm= new TreeSet<>(map.values());
		return sm.first();
		
	}
	public static Map<Character, Integer> FrequencyTest(String str) {
		Map<Character, Integer> map= new LinkedHashMap<>();
		for (Character c: str.toCharArray()) {
			
			if (map.containsKey(c))	 {
				map.put(c,map.get(c)+1);
			} else {
				map.put(c, 1);
			}
		}
		return map;
	}
	
	public static Map<String, Integer> sortByValue (Map<String, Integer> map){
		
		List<Entry<String,Integer>> list= new ArrayList(map.entrySet());
		list.sort(Entry.comparingByValue());
		map= new LinkedHashMap();
		for (Entry<String, Integer> each: list) {
			map.put(each.getKey(), each.getValue());
		}
		
		return map;
		
	}

}
