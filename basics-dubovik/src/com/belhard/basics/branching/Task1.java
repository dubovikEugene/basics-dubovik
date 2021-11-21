package com.belhard.basics.branching;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please, enter a");
		double a = scanner.nextDouble();
		System.out.println("Please, enter b");
		double b = scanner.nextDouble();
		System.out.println("Please, enter c");
		double c = scanner.nextDouble();
		System.out.println("Please, enter d");
		double d = scanner.nextDouble();
		
		double firstMinNumber = a < b ? a : b;
		double secondMinNumber = c < d ? c : d;
		
		double maxNumberOfMin = firstMinNumber > secondMinNumber ? firstMinNumber : secondMinNumber;
		System.out.println(maxNumberOfMin);
				
		scanner.close();
	}

}
