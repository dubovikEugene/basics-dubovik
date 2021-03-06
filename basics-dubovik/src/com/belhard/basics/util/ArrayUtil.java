package com.belhard.basics.util;

import java.util.Arrays;

public class ArrayUtil {

	public static void printArrayMatrix(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void getSortedAscendingArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			Arrays.sort(array[i]);
			System.out.println(Arrays.toString(array[i]));
		}
	}

	public static void getSortedDescendingArray(int[][] array) {
		int[][] reverseSortArray = array;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				reverseSortArray[i][j] = -array[i][j];
			}
		}
		for (int i = 0; i < reverseSortArray.length; i++) {
			Arrays.sort(reverseSortArray[i]);
		}
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				reverseSortArray[i][j] = -array[i][j];
			}
			System.out.println(Arrays.toString(reverseSortArray[i]));
		}
	}
	
	public static void bubleSort (int[] array) {
		boolean isSorted = false;
		while (!isSorted) {
			isSorted = true;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					isSorted = false;
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}
			}
		}
	}
}
