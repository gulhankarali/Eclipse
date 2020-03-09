package Repl;

import java.util.ArrayList;
import java.util.List;

public class TestToy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Toy> toys = new ArrayList<>();
		toys.add(new Toy("red", 10));
		toys.add(new Toy("yellow", 10));
		toys.add(new Toy("red", 10));
		double totalPrice = toys.stream().filter(e -> e.getColor() == "red").mapToDouble(e -> e.getPrice()).sum();
		System.out.println("Total Price of Red Toys: " + totalPrice);

	}

}
