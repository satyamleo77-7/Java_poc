package random;

import java.util.ArrayList;

public class sol {
	
		   
		/* Returns true if the there is a subarray
		of arr[] with sum equal to 'sum' otherwise
		returns false. Also, prints the result */
		static int subArraySum(int arr[], int n, int sum)
		{
		    /* Returns true if the there is a
			subarray of arr[] with a sum equal to
			       'sum' otherwise returns false. 
			Also, prints the result */
			    {
			        int curr_sum, i, j;
			 
			        // Pick a starting point
			        for (i = 0; i < n; i++) {
			            curr_sum = arr[i];
			 
			            // try all subarrays starting with 'i'
			            for (j = i + 1; j <= n; j++) {
			                if (curr_sum == sum) {
			                    int p = j - 1;
			                    System.out.println(
			                        "Sum found between indexes " + i
			                        + " and " + p);
			                    return 1;
			                }
			                if (curr_sum > sum || j == n)
			                    break;
			                curr_sum = curr_sum + arr[j];
			            }
			        }
			 
			        System.out.println("No subarray found");
			        return 0;}
			    }
		 
		// Driver Code
		public static void main (String[] args)
		{
		    int arr[] = {142,112,54,69,148,45,63,158,38,60,124,142,130,179,117,36,191,43,89,107,41,143,65,49,47,6,91,130,171,151,7,102,194,149,30,24,85,155,157,41,167,177,132,109,145,40,27,124,138,139,119,83,130,142,34,116,40,59,105,131,178,107,74,187,22,146,125,73,71,30,178,174,98,113};
		    int n = arr.length;
		    int sum = 665;
		    subArraySum(arr, n, sum);
		}
		}