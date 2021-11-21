package com.belhard.basics.branching;

import java.util.Scanner;

import com.belhard.basics.util.ConsoleUtil;
import com.belhard.basics.util.ResultPrinter;

public class Task3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Let's try to find out if there is a triangle in two corners\n");

		double firstAngle = ConsoleUtil.GetDoubleFromConsole(scanner, "Enter the value of the first angle -->\t");
		double secondAngle = ConsoleUtil.GetDoubleFromConsole(scanner, "Enter the value of the first angle -->\t");

		if (firstAngle + secondAngle >= 180 || firstAngle < 0 || secondAngle < 0) {
			ResultPrinter.StringResultToConsole("not a triangle");
		} else if (firstAngle + secondAngle == 90 || firstAngle == 90 || secondAngle == 90) {
			ResultPrinter.StringResultToConsole("a right triangle");
		} else {
			ResultPrinter.StringResultToConsole("a triangle");
		}
	}

}
