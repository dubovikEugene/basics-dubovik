package com.belhard.basics.linear;

import java.util.Scanner;
import java.util.Locale;

public class Task2 {

	public static void main(String[] args) {

		System.out.println("Enter a number of the following type: nnn.ddd");
		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.US);
		double num = input.nextDouble();
		double mantissaNum = (int) num;

		double reverseNum = (num * 1000) % 1000 + mantissaNum / 1000;

		System.out.println(reverseNum);

		input.close();

	}

}
