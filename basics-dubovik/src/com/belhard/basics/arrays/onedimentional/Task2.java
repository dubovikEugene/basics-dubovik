package com.belhard.basics.arrays.onedimentional;

import java.util.Scanner;

import com.belhard.basics.util.ConsoleUtil;

public class Task2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arrayLength = ConsoleUtil.GetIntFromConsole(scanner, "Plese, enter the length of the array: ");
		double[] array = new double[arrayLength];
		for (int i = 0; i < array.length; i++) {
			array[i] = ConsoleUtil.GetDoubleFromConsole(scanner, "Plese, enter " + arrayLength + " array element: ");
		}

		int numOfNegativeElements = 0;
		int numOfPositiveElements = 0;
		int numOfZeroElements = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				numOfNegativeElements++;
			} else if (array[i] > 0) {
				numOfPositiveElements++;
			} else {
				numOfZeroElements++;
			}
		}
		System.out.println("Numbers of negative elements arrray -> \t" + numOfNegativeElements + "\n"
				+ "Numbers of positive elements arrray -> \t" + numOfPositiveElements + "\n"
				+ "Numbers of zero elements arrray -> \t" + numOfZeroElements);
	}
}
