package Arrays;

import java.util.Scanner;

public class LargestSumHourGlassProblem {
	public static void main(String[] args) {
		System.out.println("Enter the size of matrix");
		Scanner sc = new Scanner(System.in);
		var row = sc.nextInt();
		var col = sc.nextInt();
		int[][] matrix = new int[row][col];
		int maxSum=Integer.MIN_VALUE;

		System.out.println("Enter " + row * col + " elements");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		sc.close();
		for(int i=0;i+3<=row;i++) {
			for(int j=0;j+3<=col;j++) {
				var sum=matrix[i][j]+matrix[i][j+1]+matrix[i][j+2]
						+matrix[i+1][j+1]
						+matrix[i+2][j]+matrix[i+2][j+1]+matrix[i+2][j+2];
				if(sum>maxSum)
					maxSum=sum;
			}
		}
		System.out.println(maxSum);
	}
}
