package Streams;

public class checkevennoinstring {
public static void main(String[] args) {
	String s="abc5428836";
	 char[] array = s.toCharArray();
	 for (char c : array) {
		if(Character.isDigit(c) &&c%2==0)
		{
			System.out.println(c);
		}
	}
	
}
}
