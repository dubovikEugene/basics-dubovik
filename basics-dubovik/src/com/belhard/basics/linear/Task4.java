package com.belhard.basics.linear;

import java.util.Scanner;

import com.belhard.basics.util.ConsoleUtil;
import com.belhard.basics.util.ResultPrinter;

public class Task4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Let`s try solve expression:\n\t");
		System.out.println("((b + sqrt(b * b + 4 * a * c)) / (2 * a)) - (a * a * a * c) + Math.pow(b, -2)\n");
		
		double a = ConsoleUtil.GetDoubleFromConsole(scanner, "Please, enter a -->\t");
		double b = ConsoleUtil.GetDoubleFromConsole(scanner, "Please, enter b -->\t");
		double c = ConsoleUtil.GetDoubleFromConsole(scanner, "Please, enter c -->\t");
		
		double sqare = Math.sqrt(b * b + 4 * a * c) / (2 * a);
		double numerator = b + sqare;
		double denominator = (2*a);
		
		double solution = numerator / denominator - (a * a * a * c) + Math.pow(b, -2);
		if (sqare > 0 && denominator != 0) {
			ResultPrinter.DoubleResultToConsole(solution);
		} else {
			System.out.println("it is impossible to solve the equation");
		}

	}

}
