package random;

public class Trial {
	public static void main(String[] args) {
		Trial t = new Trial();
		for(int i=0;i<5;++i) {
			System.out.println(i);
		}
		t.m1(new String("a"));
		}
		public void m1(Object obj) {
		System.out.println("object");
		}
		public void m1(String s) {
		System.out.println("string");
		}
}
