package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TopKfrequentElement {
	public static void main(String[] args) {

		int[] nums = { 1,2};
		var k = 2;
		Arrays.stream(topKFrequent2(nums, k)).forEach(System.out::println);
		 
	}

	public static int[] topKFrequent(int[] nums, int k) {
		Arrays.sort(nums);
		int i = 0;
		ArrayList<Integer> out = new ArrayList<Integer>();
		if (k == 1) {
			return new int[] { nums[0] };
		} else {
			out.add(nums[0]);

			while (i < nums.length - 1) {
				while (out.size() != k) {
					if (nums[i] != nums[++i]) {
						if (!out.contains(nums[i])) {
							out.add(nums[i]);
							if (out.size() == k) {
								i = nums.length - 1;
								break;
							}
						}
					}
				}
			}
			return out.stream().mapToInt(y -> y).toArray();
		}

	}
	public static int[] topKFrequent2(int[] nums, int k) {
		Map<Integer, Integer>map=new HashMap<Integer, Integer>();
		List<Integer> lastKfrequency=new ArrayList<Integer>();
		List<Integer>  result=new ArrayList<Integer>();
		for(int c:nums) {
			Integer res = map.containsKey(c)?map.put(c, map.get(c)+1):map.put(c, 1);
		}
		
		List<Integer>list=new ArrayList<Integer>(map.values());
		Collections.sort(list);
		int lowerindex=list.size()-k;
		// Top K most i.e. 3 then k, k-1, k-2
		for(int n=list.size()-1;n>=lowerindex;n--) {
			lastKfrequency.add(list.get(n));
		}
		for(int c1:lastKfrequency) {
		map.forEach((key, value) -> {
		    if (value.equals(c1)) {
		    	if(!result.contains(key)) {
		    	result.add(key);}
		    }
		});
		}
		
	return result.stream().filter(t -> t != null).mapToInt(t -> t).toArray();
		
	}
}
