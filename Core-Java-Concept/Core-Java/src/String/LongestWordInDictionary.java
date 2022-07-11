package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LongestWordInDictionary {
	public static void main(String[] args) {
		String[] input = { "wo", "wor", "worl", "world" };
		//String[] input = {"a","banana","app","appl","ap","apply","apple"};
		//String[] input = {"m","mo","moc","moch","mocha","l","la","lat","latt","latte","c","ca","cat"};
		//String[] input = {"b","br","bre","brea","break","breakf","breakfa","breakfas","breakfast","l","lu","lun","lunc","lunch","d","di","din","dinn","dinne","dinner"};
		
		System.out.println(longestWord(input));
	}

	public static String longestWord(String[] words) {
		List<String> inititalList = Arrays.asList(words);
		
		int size=words.length;
		int max=0;
		TreeSet<String>output=new TreeSet<String>();
		output.add("");
		while(size>0) {
			String input=words[size-1];
			Set<String>set=new HashSet<String>();
			
		  for(int j=1; j <= input.length(); j++)
            {
            	//String x1 = input.substring(i,j);
            	set.add(input.substring(0,j));
        }
		if(inititalList.containsAll(set)) {
		if(output==null || output.isEmpty()) {
				output.add(input);
			}
			else if((input.length()>max) ||
					(input.length()==max && 0>input.compareTo(output.first()))
					) {
              //  if(input.length()>=max || 0>input.compareTo(output.first())){
				max=input.length();
				output.clear();
				output.add(input);
              //  }
			}
			//return input;
		}
		//else {
			size--;
		//}
	}
		return output.first();
	}

}
