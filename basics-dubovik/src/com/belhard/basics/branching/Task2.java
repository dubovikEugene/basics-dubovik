package com.belhard.basics.branching;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please, enter a");

		if (scanner.hasNextDouble()) {
			double x = scanner.nextDouble();

			if (x <= 3) {
				double firstEquation = Math.pow(x, 2) - 3 * x + 9;
				System.out.println(firstEquation);
			} else {
				double secondEquation = 1 / (Math.pow(x, 3) + 6);
				System.out.println(secondEquation);
			}
		} else {
			System.out.println("It`s not a number");
		}

		scanner.close();

	}

}
