package com.belhard.basics.cycles;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please, enter two integer to indicate a segment");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println("Please, enter step");
		int h = scanner.nextInt();
		int x;
		int y;
		scanner.close();

		for (x = a; x < b; x += h) {
			if (x > 2) {
				y = x;
				System.out.println(y);
			} else {
				y = -x;
				System.out.println(y);
			}
		}

	}

}
