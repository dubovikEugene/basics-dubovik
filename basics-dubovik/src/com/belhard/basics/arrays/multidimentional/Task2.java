package com.belhard.basics.arrays.multidimentional;

import java.util.Scanner;

import com.belhard.basics.util.ArrayUtil;
import com.belhard.basics.util.ConsoleUtil;

public class Task2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] array = { { 12, 2, 5, 3, 4 }, { 12, 2, 19, 17 }, { 44, 3, 82, 7 }, { 15, 7, 1, 2 } };
		System.out.println("You have next array: \n");
		ArrayUtil.printArrayMatrix(array);
		System.out.println();
		System.out.println("0 is ascending sort");
		System.out.println("1 is desscending sort");
		System.out.println();
		int sortType = ConsoleUtil.GetIntFromConsole(scanner, "Enter 0 or 1 -->\t");
		if (sortType == 0) {
			System.out.println("Ascending sorted array:\n");
			ArrayUtil.getSortedAscendingArray(array);
		} else {
			ArrayUtil.getSortedDescendingArray(array);
		}

	}

}
