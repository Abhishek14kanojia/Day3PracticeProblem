package com.arrayDay3;

public class ReverseOrder {

	public static void main(String[] args) {
		
		int arrar [] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		for (int i = 0; i < arrar.length; i++) {
			System.out.println(arrar[i]);
		}
		for(int i = arrar.length - 1; i >= 0; i--) {
			System.out.println(arrar[i]);
		}
	
	}
}
