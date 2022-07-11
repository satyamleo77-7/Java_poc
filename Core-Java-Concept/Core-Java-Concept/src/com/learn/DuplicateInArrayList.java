package com.learn;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateInArrayList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Satyam");
		list.add("Shyam");
		list.add("Satyam");
		ArrayList<String> list2 = new ArrayList<String>();

		list2.add("Hii");
		list2.add("Shyam");
		list2.add("Gaurav");
		List<String> Output = list.stream().filter(i -> list2.contains(i)).collect(Collectors.toList());
		System.out.println(Output);
		for (String common : list) {
			if (list2.contains(common)) {
				System.out.println(common);
			}
		}
	}
}