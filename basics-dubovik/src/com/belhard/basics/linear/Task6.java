package com.belhard.basics.linear;

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please, enter x");
		int x = scanner.nextInt();
		System.out.println("Please, enter y");
		int y = scanner.nextInt();

		if (x >= -4 && x <= 4 && x != 0 && y != -1 && y >= -3 && y <= 0 || x >= -2 && x <= 2 && y >= -3 && y <= 4) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		scanner.close();
	}
}
