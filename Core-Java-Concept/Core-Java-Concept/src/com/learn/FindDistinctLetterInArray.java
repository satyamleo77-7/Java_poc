package com.learn;

public class FindDistinctLetterInArray {
	public static void main(String[] args) {
		String str = "aaGeeksfozerGeeks";
		printDistinct(str);
	}

	private static void printDistinct(String str) {
		int[] count = new int[256];
		
		for(char c: str.toCharArray()) {
			count[c]=count[c]+1;
		}
		for(int i=0;i<str.length();i++) {
			if(count[str.charAt(i)]==1)
			System.out.println(str.charAt(i));
		}
	}
}
