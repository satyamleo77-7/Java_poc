package stack;

import java.util.Stack;

public class BalancedParanthesis {
	public static void main(String[] args) {
		char[] paranthesis = { '{', '(', ')' ,'}'};
		if (isBalancedParanthesis(paranthesis))
			System.out.println("Balanced");
		else
			System.out.println("Non Balanced");
	}

	private static boolean isBalancedParanthesis(char[] paranthesis) {
		Stack<Character> stack = new Stack<>();
		for (char c : paranthesis) {
			if (c == '{' || c == '[' || c == '(')
				stack.push(c);
			else if (c == '}' || c == ']' || c == ')') {
				if (checkParanthesis(c, stack.pop())) {
					return true;
				}
			}
		}
		if (stack.isEmpty())
			return true;
		else
			return false;
	}

	private static boolean checkParanthesis(char c, Character pop) {
		if(c=='(' && pop==')')
			return true;
		if(c=='{' && pop=='}')
			return true;
		if(c=='[' && pop==']')
			return true;
		return false;
	}
}
