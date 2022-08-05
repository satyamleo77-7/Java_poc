package Arrays;

public class PrintMatrix {
	static int [][] matrix=new int[3][3];
	public static void main(String[] args) {
		
		matrix[0][0]=1;
		matrix[0][1]=2;
		matrix[0][2]=3;
		matrix[1][0]=4;
		matrix[1][1]=5;
		matrix[1][2]=6;
		matrix[2][0]=7;
		matrix[2][1]=8;
		matrix[2][2]=9;
		printRowMajor();
		System.out.println();
		printColumnMajor();
		System.out.println();
		printSpiral();
	}

	private static void printSpiral() {
		int row=0; int col=0; int i;
		int lastrow=matrix.length-1;
		int lastcol=matrix[0].length-1;
		while(row<=lastrow && col<=lastcol) {
			for(i=col;i<=lastcol;i++)
				System.out.print(matrix[row][i]+" ");
			row++;
			for(i=row;i<=lastrow;i++)
				System.out.print(matrix[i][lastcol]+" ");
			lastcol--;
			if(col<=lastcol)
			{
				for(i=lastcol;i>=col;i--)
					System.out.print(matrix[lastrow][i]+" ");
				lastrow--;
			}
			if(row<=lastrow)
			{
				for(i=lastrow;i>=row;i--)
					System.out.print(matrix[i][col]+" ");
				col++;
			}
		}
	}

	private static void printColumnMajor() {
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[0].length;j++)
				System.out.print(matrix[j][i]+" ");
		}
		}

	private static void printRowMajor() {
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[0].length;j++)
				System.out.print(matrix[i][j]+" ");
		}
	}

}
