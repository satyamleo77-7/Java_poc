package Stack;

public class Runner {
public static void main(String[] args) {
	StackUsing2Queue sq=new StackUsing2Queue();
	sq.pushUsingSingleQueue(1);
	sq.pushUsingSingleQueue(2);
	sq.pushUsingSingleQueue(3);
	System.out.println(sq.popUsingSingleQueue());
}
}
