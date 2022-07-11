package arrays;

public class RotateArrayByDcharacters {
	public static void main(String[] args) {
		int[] a= {1,2,5,9,6,4,6,3,2,4};
		rotateArr(a, 3, 10);
	}
	 static void rotateArr(int arr[], int d, int n)
	    {
	        int array[]=new int[d];
	        int g=0; int bk=d; int z=0; int k=d;
	        for(int i=0;i<n;i++){
	            
	            if(i<d)
	            {
	                array[i]=arr[i];
	            }
	            else
	            {
	                arr[g]=arr[g+k];
	                g++;
	                //k++;
	            }
	        }
	      while(z!=d)
	      {
	          arr[n-d+z]=array[z];
	          z++;
	          bk++;
	      }
	        
	    }
}
