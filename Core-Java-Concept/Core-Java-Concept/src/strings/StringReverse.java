package strings;

// char c.isWhitespace() checks whether the character is a whitespace
// string str.strip() strips leading and trailing whitespaces from a string.


public class StringReverse {
	public static void main(String[] args) {
		String input = "This is a sample string";
		System.out.println("Output   "+strrev(input));
	}

	private static String strrev(String input) {
		StringBuilder output = new StringBuilder();
		char[] inp = input.toCharArray();
		System.out.println(inp);
		for (int i = inp.length-1; i >= 0; i--) {
			output.append(inp[i]);
		}
		return output.toString();
	}
}
