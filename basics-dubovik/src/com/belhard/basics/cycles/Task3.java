package com.belhard.basics.cycles;

import com.belhard.basics.util.ResultPrinter;

public class Task3 {

	public static void main(String[] args) {
		System.out.println("find the sum of a number to the second power of the first hundred numbers");
		int result = 0;
		int n = 100;
		result = (n*(n+1)*(2*n+1))/6;
		ResultPrinter.IntResultToConsole(result);
	}

}
