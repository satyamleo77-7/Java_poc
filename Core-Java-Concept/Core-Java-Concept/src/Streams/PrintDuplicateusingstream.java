package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintDuplicateusingstream {
	public static void main(String[] args) {
		way2();
	}

	/*
	 * private static void way1() { Integer[] arr = { 1, 2, 2,3, 4, 5,5, 6, 7, 8 };
	 * List<Integer> list = Arrays.asList(arr); Map<Integer, Integer>map1=null;
	 * list.stream().map(i-> if(!map1.get(i)) { map1.put(i, 1); else { map1.put(i, )
	 * } }) }
	 */
	
	public static void way2() {
		Integer[] arr = { 1, 2, 2,3, 4, 5,5, 6, 7, 8 };
		List<Integer> list = Arrays.asList(arr);
		Integer y = list.stream().max((x1,x2)-> x1.compareTo(x2)).get();
		Set<Integer> x = list.stream().filter(i->Collections.frequency(list, i)>1).collect(Collectors.toSet());
	//System.out.println(y);
	
	List<Integer> elementList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
	elementList.stream().reduce((result, element) -> result < element ? result : element)
			.ifPresent(i -> System.out.println(i));
	

    String str = "JD\nJD\nJD"; 
    System.out.println(str);
    System.out.println(str.lines().collect(Collectors.toList()));
	}
}
