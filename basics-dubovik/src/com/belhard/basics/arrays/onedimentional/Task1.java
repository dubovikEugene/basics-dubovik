package com.belhard.basics.arrays.onedimentional;

import java.util.Scanner;

import com.belhard.basics.ConsoleUtil;

public class Task1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arrayLength = ConsoleUtil.GetIntFromConsole(scanner, "Plese, enter the length of the array: ");
		int[] arr = new int[arrayLength];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ConsoleUtil.GetIntFromConsole(scanner, "Plese, enter " + arrayLength + " array element: ");
		}

		int devider = ConsoleUtil.GetIntFromConsole(scanner, "Plese, enter the devider: ");

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % devider == 0) {
				sum += arr[i];
			}
		}

		System.out.println("Sum of all elements of the array, multiples of " + devider + " equel: " + sum);
	}

}
