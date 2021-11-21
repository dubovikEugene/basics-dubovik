package com.belhard.basics.util;

import java.util.Scanner;

public class ConsoleUtil {
	public static int GetIntFromConsole(Scanner scanner, String prompt) {
		System.out.print(prompt);
		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("It`s not integer, try again");
		}
		int intFromConsole = scanner.nextInt();
		return intFromConsole;

	}

	public static double GetDoubleFromConsole(Scanner scanner, String prompt) {
		System.out.print(prompt);
		int counter = 3;
		while (!scanner.hasNextDouble()) {
			if (counter != 0) {
				scanner.next();
				System.out.print("It`s not number, try again, you have " + counter + " tries -> \t");
				counter--;
			} else {
				System.out.println("Ok, set the defoul value = 0");
				return 0;
			}
		}
		double doubleFromConsole = scanner.nextDouble();
		return doubleFromConsole;

	}
}
