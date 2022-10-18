package com.delta;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		int sumOut = list.stream().filter(i -> i % 2 != 0).reduce(0, (a, b) -> a + b);
		System.out.println(sumOut);

	}
}
