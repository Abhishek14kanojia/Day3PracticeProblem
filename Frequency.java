package com.arrayDay3;

public class Frequency {

	public static void main(String[] args) {
		int array [] = {10, 20, 30, 40, 50, 20, 30, 60};		
		for (int i = 0; i < array.length; i++) {
			int frequency = 0;
			for (int j = i; j < array.length; j++) {
				if(array[i] == array[j]) {
					frequency ++;
				}
				
			}	System.out.println(frequency);
			
		}
	
	
	}
}
