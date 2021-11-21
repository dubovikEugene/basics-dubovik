package com.belhard.basics.linear;

import java.util.Scanner;

import com.belhard.basics.util.ConsoleUtil;
import com.belhard.basics.util.ResultPrinter;

public class Task1 {

	public static void main(String[] args) {

		System.out.println("Now let's try to solve the equation ((a-3)*b/2)+c=z");

		Scanner scanner = new Scanner(System.in);
		double a = ConsoleUtil.GetDoubleFromConsole(scanner, "Please, enter a ->\t");
		double b = ConsoleUtil.GetDoubleFromConsole(scanner, "Please, enter b ->\t");
		double c = ConsoleUtil.GetDoubleFromConsole(scanner, "Please, enter c ->\t");

		double z = ((a - 3) * b / 2) + c;
		
		ResultPrinter.DoubleResultToConsole(z);
	}

}
