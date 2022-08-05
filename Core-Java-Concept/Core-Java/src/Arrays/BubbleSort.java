package Arrays;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] intarray= {4,2,5,1,7,3,8};
		for(int i=0;i<intarray.length;i++)
		{
			for(int j=0;j<intarray.length;j++)
			{
				if(intarray[i]<intarray[j]) {
					int temp=intarray[i];
					intarray[i]=intarray[j];
					intarray[j]=temp;
				}
			}
		}
		Arrays.stream(intarray).forEach(System.out::print);
	}
}
