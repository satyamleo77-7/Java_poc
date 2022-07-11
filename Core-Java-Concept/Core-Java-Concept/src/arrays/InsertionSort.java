package arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] intararay= {20,35,-15,7,55,1,-22};
		for (int firstunsortedindex=1; firstunsortedindex < intararay.length; firstunsortedindex++)
		{
			int newElement= intararay[firstunsortedindex];
			int i;
			for (i=firstunsortedindex;i>0 && intararay[i-1]>newElement;i--)
				intararay[i]=intararay[i-1];
			intararay[i]=newElement;
		}
		for (int i : intararay) {
			System.out.println(i);
		}
	}

}
