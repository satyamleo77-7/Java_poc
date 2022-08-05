package Arrays;

public class DutchFlagProblem {
	public static void main(String[] args) {
		int[] array = { 1, 2, 0, 0, 2, 1, 2 };
		for(int i: array) {
			System.out.print(i+" ");
		}
		System.out.println();
		int mid = 0;
		int low = 0;
		int temp;
		int high = array.length - 1;

		while (mid < high) {
			switch (array[mid]) {
			case 0: {
				temp = array[mid];
				array[mid] = array[low];
				array[low] = temp;
				low++;
				mid++;
				break;
			}
			case 1: {
				mid++;
				break;
			}
			case 2: {
				temp = array[mid];
				array[mid] = array[high];
				array[high] = temp;
				high--;
				break;

			}
			}
		}

	for(int i: array) {
		System.out.print(i+" ");
	}
	}
	
}
