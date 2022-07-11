package arrays;

public class RemoveDuplicatesUsingSingleArray {
	public static void main(String[] args) {
	int nums[] = { 1, 1, 2, 3, 3, 4 };

	int length = removeDuplicate(nums);

	for (int i = 0; i < length; i++) {
		System.out.print(nums[i] + " ");
	}
}

private static int removeDuplicate(int[] nums) {
	int i = 0;
	for (int j = 1; j < nums.length; j++) {
		if (nums[i] != nums[j]) {
			i++;
			nums[i] = nums[j];
		}
	}
	return i + 1;
}
}
