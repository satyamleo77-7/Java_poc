package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class StreamsRevision {
//private static final Comparator<Map.Entry<String,Integer>> ValComp = Map.Entry<String,Integer> m1,

public static void main(String[] args) {
	String string ="A A A quick brown brown fox jumps right right over the lazy lazy dog";
	String[] strArray=string.split(" ");
	//Comparator<Map.Entry<String, Integer>> byValue=
	//		(Map.Entry<String, Integer> m1,Map.Entry<String, Integer> m2)
	//= 
	//		(Developer o1, Developer o2)->o1.getName().compareTo(o2.getName());
	Map<String,Integer> countMap=new HashMap<String,Integer>();
	Arrays.stream(string.split(" "))
	.map(i->countMap.put(i, countMap.containsKey(i)?countMap.get(i)+1:1));
	Comparator<Entry<String, Long>> comparator=(e1,e2)->e1.getValue()>e2.getValue()?-1:e1.getValue()<e2.getValue()?1:e1.getKey().compareTo(e2.getKey())*-1;
	
	
	Map<String, Long> sortedByCount=Arrays.stream(string.split(" "))
			.collect(Collectors.groupingBy(i->i,Collectors.counting()))
			.entrySet().stream()
			.sorted((e1,e2)->e1.getValue()>e2.getValue()?-1:e1.getValue()<e2.getValue()?1:e1.getKey().compareTo(e2.getKey())*-1)
			//.forEachOrdered((e)->System.out.println(e.getKey()+" "+e.getValue()));
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(oldValue,newValue)->oldValue,LinkedHashMap::new));
	
	System.out.println(sortedByCount);
			// e1,e2 -> not same the compare on basis of keys
			//else return compare based on value 
			
			/*
			 * Map<String, Integer> sortedByCount=countMap.entrySet() .stream()
			 * .sorted(Map.Entry.<String,Integer>comparingByValue().reversed())
			 * .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) ->
			 * e1, LinkedHashMap::new));
			 *///Collections.sort(sortedByCount,ValComp);
	
}
}
