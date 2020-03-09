package Repl;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Consumer;

public class CosumerInterface {
	
	public static void main(String [] args) {
		Consumer<String> doublePrinter= t -> System.out.println(t);
		List<String> list= new ArrayList<>();
		list.add("gul");
		list.add("gulli");
		list.add("gulika");
		list.add("gulhan");
				
		list.forEach(doublePrinter);
		list.forEach(each -> System.out.println(each +each+each));
		
	}

}
