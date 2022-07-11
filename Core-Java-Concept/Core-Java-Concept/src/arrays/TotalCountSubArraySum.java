package arrays;

import java.util.HashMap;
import java.util.Map;

public class TotalCountSubArraySum {
	public static void main(String[] args) {
		int[] array = {1,2,3};
		System.out.println(totalcountSubArrayForGivenSum(array, 3));

	}

	private static int totalcountSubArrayForGivenSum(int[] array, int i) {
		int count = 0, sum = 0;
		Map<Integer, Integer>map =new HashMap<>();
		map.put(0, 1);
		for(int k=0;k<array.length;k++) {
			sum+=array[k];
			if(map.containsKey(sum-i))
				count+=map.get(sum-i);
			map.put(sum, map.getOrDefault(sum, 0)+1);
		}
		return count;
	}
}
