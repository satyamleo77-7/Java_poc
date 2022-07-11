package com.learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamsLearn {
	public static void main(String[] args) {
		List<Integer>intList=new ArrayList<>(Arrays.asList(1,2,3,4,5));
		printnofrom1to100divby3and5();
		checkOdds(intList);
		List<String> nameList = new ArrayList<String>();
	}

	private static void checkOdds(List<Integer> intList) {
		System.out.println(intList.parallelStream().anyMatch(x->x%2==0));
	}

	static void printnofrom1to100divby3and5() {
		IntStream.range(1, 100).filter(x -> x % 3 == 0).filter(x -> x % 5 == 0).forEach(System.out::println);
	}
}
