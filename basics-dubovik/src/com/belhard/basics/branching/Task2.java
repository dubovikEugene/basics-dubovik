package com.belhard.basics.branching;

import java.util.Scanner;

import com.belhard.basics.util.ConsoleUtil;
import com.belhard.basics.util.ResultPrinter;


public class Task2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Now we let`s try calculate the value of the function");
		System.out.print("\n\n\tx*x - 3 * x + 9| if x <= 3\n\tor\n\t1/(x*x*x) + 6| if x > 3\n\n");
		double x = ConsoleUtil.GetDoubleFromConsole(scanner, "Please, enter X ->\t");
			if (x <= 3) {
				double firstEquation =x*x - 3 * x + 9;
				ResultPrinter.DoubleResultToConsole(firstEquation);
			} else {
				double secondEquation = 1 / (x*x*x) + 6;
				ResultPrinter.DoubleResultToConsole(secondEquation);
			}

	}

}
