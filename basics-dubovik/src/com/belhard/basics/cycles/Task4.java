package com.belhard.basics.cycles;

public class Task4 {

	public static void main(String[] args) {
		System.out.println("\n\t\t\t\tACSII\n");
		for (int i = 32; i <= 127; i++) {
			System.out.print("\t" + i + " is " + "[ " + (char) i + " ]");
			if ((i - 31) % 4 == 0) {
				System.out.println();
			}
		}

	}

}
