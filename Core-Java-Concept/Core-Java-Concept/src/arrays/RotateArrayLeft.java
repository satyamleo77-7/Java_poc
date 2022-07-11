package arrays;

public class RotateArrayLeft {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int noOfRotation = 2;
		rotateWithExtraSpace(arr, arr.length, noOfRotation);
	}

	private static void rotateWithExtraSpace(int[] arr, int length, int noOfRotation) {

		// for right rotation, get the starting index using below code
		int mod = noOfRotation % length;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[(i + mod) % length] + " ");
		}
	
	}
}
