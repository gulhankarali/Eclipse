package day46_collections2;

import java.util.*;
public class LoopMap {

	public static void main(String[] args) {
	
		Map<String, String> dataMap= new HashMap<>();
		dataMap.put("url", "www.feradje.com");
		dataMap.put("username", "user1");
		dataMap.put("password", "useruser123");
		dataMap.put("borwser", "chrome");
		dataMap.put("storemanager", "Mike Smith");
		
	    System.out.println("KEYS");
	    for (String key: dataMap.keySet()) {
	      	System.out.println("Key" +key);
	    }
		
	    System.out.println("VALUES");
	    for (String values: dataMap.values()) {
	    	System.out.println("Key "+values);
	    }
	    
	    System.out.println("KEYS");
	    for (String key: dataMap.keySet()) {
	    	System.out.println(key+ dataMap.get(key));
	    }
	    
	    Map<Integer, Student> data= new HashMap<>();
	    
	    Map<String, String[]> data1= new HashMap<>();
	    
	    
	    Map<String, List<String>> data2= new HashMap<>();
	    
	    Map<String, Map<Integer, Integer>> date3= new HashMap<>();
	    
	    
		
	}

}
