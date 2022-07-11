package com.learn;

import java.util.Arrays;

public class SeperateZeros {


	public static void main(String[] args) {
		int[] a = { 1, 0, 2, 0, 0, 1, 2, 2, 1, 2 };
		int pos=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				a[pos++]=a[i];
			}
		}
		while(pos<a.length) {
			a[pos++]=0;
		}
		System.out.println("The array created is: "+Arrays.toString(a));
	}
}
