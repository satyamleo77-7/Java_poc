package String;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LongestSubstringWithoutRepeatChar {
	 public static int lengthOfLongestSubstring(String s) {
	       TreeSet<Integer> treeofsize=new TreeSet<Integer>();
	       for (int i=0;i<s.length();i++){
	           for(int j=i+1;j<s.length();j++){
	                Set<Character>substring=new HashSet<Character>();
	               String s1=s.substring(i,j);
	               for(char c:s1.toCharArray()){
	               if(substring.contains(c)){
	                   break;
	               }
	               else{
	                   substring.add(c);
	               }
	                   }
	               treeofsize.add(substring.size());
	           }
	       } 
	     return treeofsize.last();   
	    }
	 public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("bbbb"));
	}
}
