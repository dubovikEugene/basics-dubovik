package com.belhard.basics.arrays.multidimentional;

public class Task1 {

	public static void main(String[] args) {
		int[][] array = { { 0, 1, 2, 3, 12 }, { 12, 15, 16, 17 }, { 44, 54, 82, 90 }, { 7, 7, 7, 7 } };
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
