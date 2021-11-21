package com.belhard.basics.cycles;

import java.util.Scanner;

import com.belhard.basics.util.ConsoleUtil;
import com.belhard.basics.util.ResultPrinter;

public class Task1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Now let`s calculate the sum of all positive numbers up to the entered\n");
		int num = ConsoleUtil.GetIntFromConsole(scanner, "Please, enter positive numbre -->\t");
		if (num > 0) {
			int result = (1 + num) * num / 2;
			ResultPrinter.IntResultToConsole(result);
		} else {
			System.out.println("It`s not positive integer");
		}
	}
}
