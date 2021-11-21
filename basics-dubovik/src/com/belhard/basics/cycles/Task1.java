package com.belhard.basics.cycles;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Please, enter positive integer");
		int result = 0;
		if(scanner.hasNextInt()) {
			int num = scanner.nextInt();
			if(num > 0) {
				result = (1+num)* num/2;
//				for ( int i = 1; i <= num; i++ ) {
//					result += i;
//				} 
			}else {
				System.out.println("It`s not positive integer");
			}
			
		} else {
			System.out.println("It`s not integer, try again");
		}
		System.out.println("Sum of all positive numbers up to given " +   result);
		scanner.close();
	}
}
