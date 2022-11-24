package com.arrayDay3;

public class DuplicateElement {

	public static void main(String[] args) {
	
		int array [] = {1, 2, 5, 6, 8, 6, 9, 4, 3, 2, 1, 5};
		for (int i =0; i < array.length; i++) {
			for(int j = i + 1; j < array.length; j++) {
				if(array[i] == array[j]) {
					System.out.println(array[j]);
				}
				
			}
			
		}
		
		}
}
