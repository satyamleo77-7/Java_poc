package ArraysSort;

import java.util.Arrays;
import java.util.Optional;

public class chkspl {
	public static void main(String[] args) {
		int[] nums = { 2, 14, 18, 22, 22 };
		String x = 1+"";
		Optional<String> opt= Optional.of(null);
		System.out.println(containsDuplicate(nums));
	}

	private static boolean containsDuplicate(int[] nums) {
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				return true;
			}
		}
		return false;
	}
}
