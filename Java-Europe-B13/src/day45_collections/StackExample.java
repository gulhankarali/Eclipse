package day45_collections;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
	
		Stack<Integer> stack= new Stack<>();
		
		stack.add(50);
		stack.add(78);
		stack.push(60);
		stack.push(7);
		
		System.out.println(stack);
		
		System.out.println(stack.peek());
		
		stack.pop();
		
		System.out.println(stack);

	}

}
