package com.belhard.basics.branching;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of the first angle of the triangle");
		double a = scanner.nextDouble();
		System.out.println("Enter the value of the second angle of the triangle");
		double b = scanner.nextDouble();
		if(a+b >= 180 || a < 0 || b < 0) {
			System.out.println("This is not a triangle");
		}else if(a+b == 90 || a == 90 || b == 90) {
			System.out.println("This is a right triangle");
		}else {			
			System.out.println("This is a triangle");
		}
		
		scanner.close();

	}

}
