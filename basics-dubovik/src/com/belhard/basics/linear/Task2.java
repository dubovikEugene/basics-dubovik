package com.belhard.basics.linear;

import java.util.Scanner;

import com.belhard.basics.util.ConsoleUtil;
import com.belhard.basics.util.ResultPrinter;

public class Task2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double num = ConsoleUtil.GetDoubleFromConsole(scanner, "Enter a number of the following type: nnn.ddd ->\t");
		double mantissaNum = (int) num;
		double reverseNum = (num * 1000) % 1000 + mantissaNum / 1000;

		ResultPrinter.DoubleResultToConsole(reverseNum);

	}

}
