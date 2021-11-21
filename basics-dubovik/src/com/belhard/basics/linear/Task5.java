package com.belhard.basics.linear;

import java.util.Scanner;

import com.belhard.basics.util.ConsoleUtil;
import com.belhard.basics.util.ResultPrinter;

public class Task5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("let`s try solve expression \n\t");
		System.out.println("((sin(x) + cos(y)) / (cos(x) - sin(y)) * tan(x * y)\n");

		double x = ConsoleUtil.GetDoubleFromConsole(scanner, "Please, enter x in degree -->\t");
		double y = ConsoleUtil.GetDoubleFromConsole(scanner, "Please, enter y in degree -->\t");
		
		double radX = Math.toRadians(x);
		double radY = Math.toRadians(y);
		
		double numerator = Math.sin(radX) + Math.cos(radY);
		double denominator = Math.cos(radX) - Math.sin(radY);
		
		double result = (numerator / denominator) * Math.tan(radX * radY);
		double degResult = Math.toDegrees(result);
		if (denominator != 0) {
			ResultPrinter.DoubleResultToConsole(degResult);
		} else {
			System.out.println("it is impossible to solve the equation");
		}

	}

}
