package com.arrayDay3;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int array [] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int size = array.length;
		
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				
				if(array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
					
					
				}
			}
		}
		System.out.println(array[size-2]);
	}
}
