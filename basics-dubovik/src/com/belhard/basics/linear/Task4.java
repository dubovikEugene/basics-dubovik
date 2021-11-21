package com.belhard.basics.linear;

import java.util.Scanner;


public class Task4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please, enter a");
		double a = scanner.nextDouble();
		System.out.println("Please, enter b");
		double b = scanner.nextDouble();
		System.out.println("Please, enter c");
		double c = scanner.nextDouble();

		
		double solution = ((b + Math.sqrt(Math.pow(b, 2) + 4*a*c)) / (2*a)) - (Math.pow(a, 3)*c) + Math.pow(b, -2);
		if(Math.sqrt(Math.pow(b, 2) + 4*a*c) > 0) {
			System.out.println(solution);			
		} else {
			System.out.println("it is impossible to solve the equation, since cannot square root of negative number");
		}
		scanner.close();
				
	}

	
	
}
