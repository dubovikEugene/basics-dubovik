package com.belhard.basics.linear;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Please, enter a natural number");
		if(scanner.hasNextInt()) {
			int timeInSeconds = scanner.nextInt();
			int hours = timeInSeconds / 3600;
			int minutes = (timeInSeconds - (hours * 3600)) / 60;
			int seconds = (timeInSeconds - (hours * 3600)) - (minutes*60);
			String timeFormatted = String.format("%02dh %02dmin %02ds", hours, minutes, seconds);
			
			System.out.println(timeFormatted);

		} else {
			System.out.println("It`s not a natural number, pls try again");
		}
		scanner.close();

	}

}
