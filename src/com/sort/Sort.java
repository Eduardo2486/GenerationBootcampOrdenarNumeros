package com.sort;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[3];
		Scanner input = new Scanner(System.in);
		System.out.println("Primer numero");
		numbers[0] = input.nextInt();
		System.out.println("Segundo numero");
		numbers[1] = input.nextInt();
		System.out.println("Tercer numero");
		numbers[2] = input.nextInt();
		input.close();
		for(int i = 0 ; i < numbers.length ; i++) {
			for(int j = i+1 ; j < numbers.length ; j++) {
				int tmp = 0;
				if (numbers[i] > numbers[j]){  
					tmp = numbers[i];  
					numbers[i] = numbers[j];  
					numbers[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(numbers));
		
		for(int i = 0 ; i < numbers.length ; i++) {
			for(int j = i+1 ; j < numbers.length ; j++) {
				int tmp = 0;
				if (numbers[i] < numbers[j]){  
					tmp = numbers[i];  
					numbers[i] = numbers[j];  
					numbers[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(numbers));
	}

}
