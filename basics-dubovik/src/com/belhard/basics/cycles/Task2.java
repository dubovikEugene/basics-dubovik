package com.belhard.basics.cycles;

import java.util.Scanner;

import com.belhard.basics.util.ConsoleUtil;
import com.belhard.basics.util.ResultPrinter;

public class Task2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Let`s calculate the value of the function on segment [a,b] with step h");
		System.out.print("\n\n\ty = x| if x > 2\n\tor\n\ty = -x| if x <= 2\n\n");
		int a = ConsoleUtil.GetIntFromConsole(scanner, "Please, enter a -->\t");
		int b = ConsoleUtil.GetIntFromConsole(scanner, "Please, enter b -->\t");
		int step = ConsoleUtil.GetIntFromConsole(scanner, "Please, enter step -->\t");
		int x;
		int result;

		for (x = a; x < b; x += step) {
			if (x > 2) {
				result = x;
				ResultPrinter.IntResultToConsole(result);
			} else {
				result = -x;
				ResultPrinter.IntResultToConsole(result);
			}
		}

	}

}
