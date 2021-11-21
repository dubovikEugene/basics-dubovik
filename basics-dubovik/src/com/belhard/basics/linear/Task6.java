package com.belhard.basics.linear;

import java.util.Scanner;

import com.belhard.basics.util.ConsoleUtil;

public class Task6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("find out if your point lies in the shaded area\n");
		
		int x = ConsoleUtil.GetIntFromConsole(scanner, "Please, enter X -->\t");
		int y = ConsoleUtil.GetIntFromConsole(scanner, "Please, enter Y -->\t");

		if (x >= -4 && x <= 4 && x != 0 && y != -1 && y >= -3 && y <= 0 || x >= -2 && x <= 2 && y >= -3 && y <= 4) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}
