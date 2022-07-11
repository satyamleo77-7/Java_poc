package strings;

public class CheckAlphabets {
	public static void main(String[] args) {
		String str = "shbvjchjscnknsc";
		System.out.println(str.chars().allMatch(Character::isLetter));
		System.out.println(str.matches("^[a-zA-Z]+$"));
	}
}
