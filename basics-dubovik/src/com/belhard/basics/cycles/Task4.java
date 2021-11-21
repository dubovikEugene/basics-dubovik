package com.belhard.basics.cycles;

public class Task4 {

	public static void main(String[] args) {
		char ch = 0;

		for (int i = 0; i <= 127; i++) {
			ch++;
			if (ch < 32 || ch == 127) {
				System.out.println("The number " + i + " is control character");
			} else {
				System.out.println("The number " + i + " contains the next printable character ->\t" + ch);
			}

		}

	}

}
