package com.belhard.basics.linear;

import java.util.Scanner;

import com.belhard.basics.util.ConsoleUtil;
import com.belhard.basics.util.ResultPrinter;

public class Task3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Now we let`s try covert seconds to next format\n\n\tÍÍh ÌÌmin SSs\n");
		int timeInSeconds = ConsoleUtil.GetIntFromConsole(scanner, "Please, enter natureal number -->\t");
		int hours = timeInSeconds / 3600;
		int minutes = (timeInSeconds - (hours * 3600)) / 60;
		int seconds = (timeInSeconds - (hours * 3600)) - (minutes * 60);
		String timeFormatted = String.format("%02dh %02dmin %02ds", hours, minutes, seconds);

		ResultPrinter.StringResultToConsole(timeFormatted);

	}

}
