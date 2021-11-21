package com.belhard.basics.arrays.onedimentional;

import java.util.Scanner;

import com.belhard.basics.ConsoleUtil;

public class Task3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arrayLength = ConsoleUtil.GetIntFromConsole(scanner, "Plese, enter the length of the array: ");
		int[] array = new int[arrayLength];
		for (int i = 0; i < array.length; i++) {
			array[i] = ConsoleUtil.GetIntFromConsole(scanner,
					"Plese, enter " + arrayLength + " positive array element: ");
		}

		int minElemOfArray = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < minElemOfArray) {
				minElemOfArray = array[i];
			}
		}

		int newArrayLengthCount = 0;
		for (int i = 0; i < array.length; i++) {
			if (minElemOfArray == array[i]) {
				newArrayLengthCount++;
			}
		}

		int newArrayLength = arrayLength - newArrayLengthCount;
		int[] newArray = new int[newArrayLength];
		int newArrayIndex = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != minElemOfArray) {
				newArray[newArrayIndex] = array[i];
				newArrayIndex++;
			}
		}
		System.out.print("New array: ");
		for (int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i] + " ");
		}
	}

}
