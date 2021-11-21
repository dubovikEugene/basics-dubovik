package com.belhard.basics.cycles;

public class Task3 {

	public static void main(String[] args) {
		int result = 0;
//		int n = 100;
//		result = (n*(n+1)*(2*n+1))/6;
		for (int i = 0; i <= 100; i++) {
			result += Math.pow(i, 2);
		}
		System.out.println(result);
	}

}
