package multithreading;

public class zeroonetwo {
public static void main(String[] args) {
	int[] a= {0,2,1,2,0};
	sort012(a, a.length);
}
public static void sort012(int a[], int n)
{
   int zero=0;
   int one=0;
   int two=0;
   int j=0;
   
   for(int i=0;i<n;i++){
       if(a[i]==0)
       zero++;
       if(a[i]==1)
       one++;
       if(a[i]==2)
       two++;
   }
   for(j=0;j<zero;j++)
   a[j]=0;
   for(j=zero;j<zero+one;j++)
   a[j]=1;
   for(j=zero+one;j<one+two;j++)
   a[j]=2;
}
}
