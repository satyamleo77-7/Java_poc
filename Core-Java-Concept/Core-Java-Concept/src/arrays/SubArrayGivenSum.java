package arrays;

import java.util.HashMap;
import java.util.Map;

public class SubArrayGivenSum {
	public static void main(String[] args) {
		int[] array = { 9, 4, 7, 3, -6, 2, 9, 2 };
		//findSubArraySum(array, 8);
		findLargestSubArrayForSum(array, 13);

	}

	private static void findLargestSubArrayForSum(int[] array, int sum) {
		int currentSum = 0;
		int start = 0;
		int end = -1;
		int largestSubArrayLength=0;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			currentSum += array[i];
			if (currentSum - sum == 0) {
				start = 0;
				end = i;
				break;
			}
			if (map.containsKey(currentSum - sum)) {
				
				if(end-start+1>largestSubArrayLength)
				{
					//largestSubArrayLength =end-start+1;
					start = map.get(currentSum - sum) + 1;
					end = i;
				}
			//	break;
			}
			map.put(currentSum, i);
		}
		if (end == -1) {
			System.out.println("No subarray found with Given Sum");
		} else
			System.out.println("Start  " + start + "  End  " + end);
	}

	private static void findSubArraySum(int[] array, int sum) {
		int currentSum = 0;
		int start = 0;
		int end = -1;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			currentSum += array[i];
			if (currentSum - sum == 0) {
				start = 0;
				end = i;
				break;
			}
			if (map.containsKey(currentSum - sum)) {
				start = map.get(currentSum - sum) + 1;
				end = i;
				break;
			}
			map.put(currentSum, i);
		}
		if (end == -1) {
			System.out.println("No subarray found with Given Sum");
		} else
			System.out.println("Start  " + start + "  End  " + end);
	}
}
