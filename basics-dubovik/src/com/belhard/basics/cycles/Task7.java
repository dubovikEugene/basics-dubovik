package com.belhard.basics.cycles;

import java.util.Scanner;

import com.belhard.basics.util.ConsoleUtil;

public class Task7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\tThe program displays the divisors for each natural number in the range from m to n\n");
		int intervalStart = ConsoleUtil.GetIntFromConsole(scanner, "Enter interval start ->\t");
		int intervalEnd = ConsoleUtil.GetIntFromConsole(scanner, "Enter interval end ->\t");

		for (int i = intervalStart; i <= intervalEnd; i++) {
			for (int j = 2; j <= i; j++) {
				if (i % j == 0 && i != j) {
					System.out.println(i + " have devidor ->\t" + j);
				}
			}
		}
		scanner.close();
	}

}
