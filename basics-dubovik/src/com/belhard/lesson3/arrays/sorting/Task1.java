package com.belhard.lesson3.arrays.sorting;

import java.util.Arrays;

import com.belhard.basics.util.ArrayUtil;

public class Task1 {

	public static void main(String[] args) {
		int[] array = { 16, 2, 4, 1, 3, 9, 14,  10, 5 };
		
		System.out.println("array before sort:\n\t" + Arrays.toString(array) + "\n");
		ArrayUtil.bubleSort(array);
		System.out.println("array after sort:\n\t" + Arrays.toString(array) + "\n");

	}

}
