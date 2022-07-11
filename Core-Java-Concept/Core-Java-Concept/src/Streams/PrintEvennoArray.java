package Streams;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PrintEvennoArray {
public static void main(String[] args) {
	int[] array= {1,2,3,4,5,6,7,8,9};
	Arrays.stream(array).filter(e->e%2==0).forEach(System.out::println);
	Arrays.stream(array).map(e->e*e).boxed().collect(Collectors.toList());
	Arrays.stream(array).map(e->e*e).forEach(System.out::println);
	System.out.println(Arrays.stream(array).sum());
}
}
