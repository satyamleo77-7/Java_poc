import java.util.Arrays;

public class trial2 {
	public static void main(String[] args) {
		String str1 = "cat";
		String comma = ",";
		String str2 = "tac";
		String str3 = "aa,bbb,,c,,,,dddd";
		String str4 = str3.replaceAll(",", "@,");
		String z = str4.replace(",@", "");
		// str3.replaceAll("^[mmmm]$", comma);
		// String z = str3.replaceAll("^[mm]$", comma);

		System.out.println(z.replace("@", ""));
		// String str4= "aa,bbb,c,dddd";

		char[] x = str1.toCharArray();
		char[] y = str2.toCharArray();
		int k = isAnagram(x, y, str2);
		if (k == str1.length() && k == str2.length()) {
			//System.out.println("Anagram");
		} else {
			//System.out.println("Non Anagram");
		}
		
		int[]res=checkAnagaram(x);
		int[]res1=checkAnagaram(y);
		if(Arrays.equals(res, res1)){
			System.out.println("Anagram");
		} else {
			System.out.println("Non Anagram");
		}
	}

	private static Integer isAnagram(char[] x, char[] y, String str) {
		int count = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < y.length; j++) {
				if (x[i] == y[j]) {
					count++;
				}
			}
		}
		return count;

	}

	public static int[] checkAnagaram(char[] input) {
		int[] arr = new int[256];
		for (char c : input) {
			arr[c]++;
		}
		return arr;
	}
}
