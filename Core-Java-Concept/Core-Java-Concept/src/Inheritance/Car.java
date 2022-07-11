package Inheritance;

import java.util.HashMap;
import java.util.Map;

public class Car {
 int key;
 int value;
 String val;
	public Car(int key) {
	super();
	this.key = key;
}

	public Car(int key, String val) {
		super();
		this.key = key;
		this.val = val;
	}

	public Car(int key, int value) {
	super();
	this.key = key;
	this.value = value;
}

	public static void main(String[] args) {
		Map map=new HashMap();
		map.put("Satyam", 100);
		map.put("Raja", 101);
		 map.values();
		 System.out.println(map.values());
		 
		 Integer i1=Integer.valueOf(99);
		 Integer i2=Integer.valueOf(99);
		 System.out.println(i1==i2);
		 Integer i3=Integer.valueOf(1023);
		 Integer i4=Integer.valueOf(1023);
		 System.out.println(i3==i4);
	}
}
