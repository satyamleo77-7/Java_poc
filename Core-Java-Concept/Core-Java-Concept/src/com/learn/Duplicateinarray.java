package com.learn;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Duplicateinarray {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4 };
		System.out.println(containsDuplicate1(array));
	}

	public static boolean containsDuplicate(int[] nums) {
		boolean flag = false;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				var x = nums[i];
				var y = nums[j];
				if (nums[i] == nums[j])
					flag = true;
			}
		}
		return flag;
	}

	public static boolean containsDuplicate1(int[] nums) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (Integer i:nums) {
			if(set.contains(i))
				return true;
			if(i!=null)
				set.add(i);
		}
		return false;
	}
}
