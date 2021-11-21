package com.belhard.basics.linear;

import java.util.Scanner;
import java.util.Locale;

public class Task1 {

	public static void main(String[] args) {
		
		System.out.println("Now let's try to solve the equation ((a-3)*b/2)+c=z");
		
		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.US);
		System.out.println("Enter the value on - a");
		double a = input.nextDouble();
		System.out.println("Enter the value on - b");
		double b = input.nextDouble();
		System.out.println("Enter the value on - c");
		double c = input.nextDouble();
		
		input.close();
		double z = ((a-3)*b/2)+c;
		System.out.println("Solution of an equation ((a-3)*b/2)+c= " + z);
		
	}

}
