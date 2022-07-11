package com.learn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PrintValues {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Map<Integer,Float>data=new LinkedHashMap<Integer,Float>();
	System.out.println("Enter the no  of Entries u want to make");
	int n=sc.nextInt();
	for(int i=0;i<n;i++) {
	System.out.println("Enter Time in HHMM and stock price");
	int time=sc.nextInt();
	System.out.println("Enter stock price");
	Float stock=sc.nextFloat();
	data.put(time, stock);
	}
	for (var entry : data.entrySet()) {
	//    System.out.println(entry.getKey() + "/" + entry.getValue());
	}
	List<Float> list = new ArrayList<Float>(data.values());
	List<Integer> list2 = new ArrayList<Integer>(data.keySet());
	Float max=Collections.max(list);
	Float min=Collections.min(list);
	int minindex = list.indexOf(min);
	int maxindex= list.indexOf(max);
	if(list2.get(maxindex) >list2.get(minindex)) {
		System.out.println("Time Range "+ list2.get(minindex)+" "+list2.get(maxindex));
		System.out.println("Value Range "+ min+" "+max);
	}
	
}

}
