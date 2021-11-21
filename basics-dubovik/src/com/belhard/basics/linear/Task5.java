package com.belhard.basics.linear;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please, enter x");
		double x = scanner.nextDouble();
		System.out.println("Please, enter y");
		double y = scanner.nextDouble();

		double result = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
		System.out.println(result);

		scanner.close();

	}

}
