package com.belhard.basics.cycles;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insert the extremes of the gap");
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		
		for(int i = m; i<=n; i++) {
			for(int j = 2; j <=i; j++) {
				if(i%j == 0 && i!=j) {
					System.out.println(i +" have devidors ->\t" + j);
				} 
			}
		}		
		scanner.close();
	}

}
