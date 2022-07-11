package strings;

public class VowelCheck {
public static void main(String[] args) {
	String input = "This is a sample string";
	// Trial for checking whitespace just exploring function
	for(char c:input.toCharArray()) {
		Character.isWhitespace(c);
	}
	System.out.println("Output   "+checkVowel(input));
}

private static Boolean checkVowel(String input) {
	return input.toLowerCase().matches(".*[aeiou].*");
}
}
