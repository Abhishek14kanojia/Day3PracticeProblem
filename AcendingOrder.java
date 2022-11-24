package com.arrayDay3;

public class AcendingOrder {

	public static void main(String[] args) {
		int array [] = {1, 5, 9, 4, 3, 6, 7, 8, 2};
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		for(int i = 0; i < array.length; i++) {
			for(int j = i + 1; j < array.length; j++) {
				if(array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
			
		}
		System.out.println();
		for(int i = 0; i < array.length; i ++) {
			System.out.println(array[i] + " ");
		}
	}	
	
	
}
