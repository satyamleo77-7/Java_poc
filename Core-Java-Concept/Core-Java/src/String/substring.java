package String;

public class substring {
	 // Function to print all substring
    public static String[] SubString(String str, int n)
    {
    	String[] chararray=new String[256];
    	int k=0;
       for (int i = 0; i < n; i++)
           for (int j = i+1; j <= n; j++)
           {
        	   String x=(str.substring(i, j));
        	   chararray[k++]=x;
        	   x="";
           }
       return chararray;
    }
 
    public static void main(String[] args)
    {
    	
        String str = "This is a test string";
        String pattern="tist";
        String[] out=SubString(str, str.length());
        for(String s :out) {
        	if(s!=null)
        	 System.out.println(s);
        }
       
    }
}
