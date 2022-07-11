package arrays;

public class MergeSort {
	public static void main(String[] args) {
		int arr[] = { 12, 11, 13, 5, 6, 7 };

		System.out.println("Given Array");
		printArray(arr);

		MergeSort ob = new MergeSort();
		ob.mergeandsort(arr, 0, arr.length - 1);

		System.out.println("\nSorted array");
		printArray(arr);
	}
	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	private static void mergeandsort(int[] array, int begin, int end) {
		if (begin < end) {

			int mid = (begin + end) / 2;
			mergeandsort(array, begin, mid);
			mergeandsort(array, mid + 1, end);
			merge(array, begin, mid, end);
		}

	}

	private static void merge(int[] array, int begin, int mid, int end) {
	//	int i,j,k;
		int n1 = mid - begin + 1;
		int n2 = end - mid;
		// TEMP ARRAYS
		int LeftArray[] = new int[n1];
		int RightArray[] = new int[n2];
		// copying data to temp array
		for (int i = 0; i < n1; ++i)
			LeftArray[i] = array[begin + i];
		for (int j = 0; j < n2; ++j)
			RightArray[j] = array[mid + 1 + j];
		int i=0,j=0;
		int k=begin;
		while (i < n1 && j < n2) {
			if (LeftArray[i] <= RightArray[j]) {
				array[k] = LeftArray[i];
				i++;
			} else {
				array[k] = RightArray[j];
				j++;
			}
			k++;
		}
		 while (i<n1)    
		    {    
		        array[k] = LeftArray[i];    
		        i++;    
		        k++;    
		    }    
		      
		    while (j<n2)    
		    {    
		    	array[k] = RightArray[j];    
		        j++;    
		        k++;    
		    }    
	}
}
