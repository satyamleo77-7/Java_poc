import java.util.Arrays;
import java.util.stream.IntStream;

public class trial {
	public static void main(String[] args) {
		System.out.println("Stream without terminal operation");
		 Arrays.stream(new int[] { 1, 2, 3 }).map(i -> {
			System.out.println("doubling first " + i);
			return i * 2;
		});
		System.out.println("Stream with terminal operation");
		int y = Arrays.stream(new int[] { 1, 2, 3 }).map(i -> {
			System.out.println("doubling second" + i);
			return i * 2;
		}).sum();
		System.out.println(y);
	}
}