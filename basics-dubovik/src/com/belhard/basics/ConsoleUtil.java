	package com.belhard.basics;

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
		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("It`s not number, try again");
		}
		int doubleFromConsole = scanner.nextInt();
		return doubleFromConsole;
		
	}
	
}
