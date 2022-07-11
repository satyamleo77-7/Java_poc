import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class KthNonRepeatingCharacterArray {
	public static void main(String[] args) {
		String str="geeksforgeeks";
		char[] array = str.toCharArray();
		List<Character> list=new ArrayList<Character>();
		char[] out=new char[str.length()];
		int  k=0;
		for(int i=0;i<str.length();i++) {
			int flag=0;
			for(int j=0;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j))
					flag++;
			}
			if(flag==1)
			{
				out[k++]=str.charAt(i);
				
			}
		}
		System.out.println(out[2]);
			
			singleloop(array);
	}

	private static void singleloop(char[] array) {
		int[] intarray=new int[256];
		String out="";
		for(char c:array)
		{
			intarray[c]++;
		}
		for(int i=0;i<intarray.length;i++)
		{
			if(intarray[i]==1) {
			char x= (char)i;
			out=out+x;
			}
		}
		System.out.println(out.charAt(2));
	}
}
