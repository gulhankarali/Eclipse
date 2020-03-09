package day46_collections2;
import java.util.*;
public class SortStudents {

	public static void main(String[] args) {

		List <Integer> list= new ArrayList<>();
		
		list.add(10);
		list.add(1);
		list.add(120);
		list.add(510);
		list.add(70);
		list.add(90);
		list.add(990);
		list.add(10000);
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
		
		List<Student> st= new ArrayList<>();
		
		st.add(new Student(300, "Mike"));
		st.add(new Student(20, "Melis"));
		st.add(new Student(3200, "Moron"));
		st.add(new Student(33300, "Melehat"));
		
		System.out.println(st);
		
		String s1="a";
		String s2= "w";
		
		System.out.println(s1.compareTo(s2));

	}

}
