package learn.com.misc;

import java.util.Stack;

public class Practice_Stack {

	public static void main(String[] args) {
			Stack <Integer> stack = new Stack<>();
			stack.push(7);
			stack.push(5);
			stack.push(2);
			System.out.println(stack.peek());
			System.out.println(stack.pop());
			System.out.println(stack);
	}

}
