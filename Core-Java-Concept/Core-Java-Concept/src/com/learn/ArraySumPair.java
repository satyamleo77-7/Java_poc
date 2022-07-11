package com.learn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArraySumPair {
	public static void pairedElements1(int[] arr, int sum) {

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			map.put(num, i);
			int otherPair = sum - arr[i];
			if (map.containsKey(otherPair)) {
				System.out.println("(" + arr[map.get(otherPair)] + "," + num + ")");
			}
			
		}

	}
	public static void main(String[] args) {
		int arr[] = { 5, 8, 3, 4, 2, 6, 10, 7, 1, 9 };

		Arrays.sort(arr);
		//pairedElements(arr, 10);
		System.out.println("----------------");
		pairedElements1(arr, 10);
	}

}
