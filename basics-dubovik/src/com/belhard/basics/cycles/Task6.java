package com.belhard.basics.cycles;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers");
		String a = scanner.nextLine();
		String b = scanner.nextLine();

		for (int i = 0; i < a.length(); i++) {

			for (int j = 0; j < b.length(); j++) {
				if (a.charAt(i) == b.charAt(j)) {
					System.out.println("The number that is included in both integers is " + a.charAt(i));
				}
			}

		}
		scanner.close();

	}

}
