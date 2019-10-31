package com.piatakha;

public class IF {
	public static void main(String args[]) {
		String[] arr = new String[30];
		String[] arr2 = { "a", "b" };
		String[] arr3 = { "c", "d" };
		arr2 = arr3;
		arr3[0] = "New";
		for (String string : arr) {
			System.out.println(arr2[0]);
		}
	
	}
}