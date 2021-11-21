package com.belhard.basics.util;

import java.util.Scanner;

public class ConsoleUtil {
	public static int GetIntFromConsole(Scanner scanner, String prompt) {
		System.out.print(prompt);
		int counter = 4;
		while (!scanner.hasNextInt()) {
			scanner.next();
			counter--;
			if (counter != 0) {
				System.out.print("It`s not integer, try again you have " + counter + " tries -> \t");

			} else {
				System.out.println("Sorry, try next time");
				System.exit(1);
			}
		}
		int intFromConsole = scanner.nextInt();
		return intFromConsole;

	}

	public static double GetDoubleFromConsole(Scanner scanner, String prompt) {
		System.out.print(prompt);
		int counter = 4;
		while (!scanner.hasNextDouble()) {
			scanner.next();
			counter--;
			if (counter != 0) {
				System.out.print("It`s not integer, try again you have " + counter + " tries -> \t");
				
			} else {
				System.out.println("Sorry, try next time");
				System.exit(1);
			}
		}
		double doubleFromConsole = scanner.nextDouble();
		return doubleFromConsole;

	}
}
