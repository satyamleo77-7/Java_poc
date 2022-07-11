package Streams;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamConcepts {

	public static void main(String[] args) {
		Integer[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		String[] str = { "rrr", "sssss", "kkkkkkk", "bbbbbb" };
		Stream<String> streamOfString1 = Arrays.stream(str);
		var out=streamOfString1.map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(out);
		
		streamOfString1.map(String::toUpperCase)
	}

}
