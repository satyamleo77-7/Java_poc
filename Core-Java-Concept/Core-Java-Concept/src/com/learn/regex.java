package com.learn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {
public static void main(String[] args) {
	String str="Malware is the 'malware'";
	Pattern p= Pattern.compile("[a-zA-Z0-9 ]+('malware')");
	Matcher m= p.matcher(str);
	boolean b=m.matches();
	System.out.println(b);
}
}
