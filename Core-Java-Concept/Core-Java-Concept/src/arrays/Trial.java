package arrays;

class Trial implements Cloneable {
	int rollno;
	String name;

	public Trial(int rollno, String name) {
		//super();
		this.rollno = rollno;
		this.name = name;
	}

	/*
	 * public Object clone() throws CloneNotSupportedException { return
	 * super.clone(); }
	 */

	public static void main(String[] args) {
		
		try {
			Trial s1 = new Trial(101, "amit");

			Trial s2 = (Trial) s1.clone();

			System.out.println(s1.rollno + " " + s1.name);
			System.out.println(s2.rollno + " " + s2.name);

		} catch (CloneNotSupportedException c) {
		}
	}
}
