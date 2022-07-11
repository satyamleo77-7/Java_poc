package String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Problem {
	public static void main(String[] args) {
		String input = "aaccb";
		int flag=0;
		Set<char[]>set=new HashSet<char[]>();
		char x = 'a';
		char y = 'c';
		for(int i=0; i < input.length() ;i++)
        {
            for(int j=i+2; j <= input.length(); j++)
            {
            	String x1 = input.substring(i,j);
            	set.add(input.substring(i,j).toCharArray());
            }
        }
		for(char[] c:set) {
			if((c[0]==x && c[c.length-1]==y) ||(c[0]==y && c[c.length-1]==x)) {
				flag++;
			}
		}
		System.out.println(flag);
	}
}
