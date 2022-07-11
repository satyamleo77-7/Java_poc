package String;

public class kthDragon {
	public static void main(String[] args) {
		String str = "1";
		int n = 3;
		String out = "";
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < str.length(); j++) {
				if (j % 2 == 0) {
					out = out + "1" + str.toCharArray()[j] + "0";
				} else {
					out = out + str.toCharArray()[j];
				}
				if (j == str.length() - 1) {
					str = out;
					out = "";
					break;
				}
			}
		}
		System.out.println(str);
	}
}
