package String;

//i.like.this.program.very.much
//Output: much.very.program.this.like.i
public class ReverseWordsOfString {
	public static void main(String[] args) {
		String out="";
		String str = "i.like.this.program.very.much";
		String[] x = str.split("\\.");
		for(int i =x.length-1;i>=0;i--) {
			out=(i!=0)?out.concat(x[i]).concat("."):out.concat(x[i]);
		}
		System.out.println(out);
		
				String X="45";String y="48";
		       Integer return_out= Integer.parseInt(X)+Integer.parseInt(y);
		       System.out.println(String.valueOf(return_out));
		    }
	}
