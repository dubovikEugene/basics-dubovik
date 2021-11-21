package com.belhard.basics.branching;

import java.util.Scanner;

import com.belhard.basics.util.ConsoleUtil;

public class Task1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Let`s find max(min(a,b), min(c,d)): ");
		double a = ConsoleUtil.GetDoubleFromConsole(scanner, "Plas, enter a ->\t");
		double b = ConsoleUtil.GetDoubleFromConsole(scanner, "Plas, enter b ->\t");
		double c = ConsoleUtil.GetDoubleFromConsole(scanner, "Plas, enter c ->\t");
		double d = ConsoleUtil.GetDoubleFromConsole(scanner, "Plas, enter d ->\t");
		scanner.close();

		double firstMinNumber = a < b ? a : b;
		double secondMinNumber = c < d ? c : d;
		double maxNumberOfMin = firstMinNumber > secondMinNumber ? firstMinNumber : secondMinNumber;
		
		System.out.println("The max of min -->\t" + maxNumberOfMin);
	}

}
