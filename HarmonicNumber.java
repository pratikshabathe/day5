package com.bl.day5;

import java.util.Scanner;
public class HarmonicNumber {
	public static void main(String[] args) {
		float harmonicValue = 0;
		int N = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive number");
		
		do {
			N = sc.nextInt();
			if (N < 1) {
				System.out.println("This not valid. Enter again");
		}
	} while (N < 1);
	sc.close();
	for (byte i = 1; i <= N; i++) {
		harmonicValue += (float) 1 / i;
	}
	System.out.println(" Harmonic Number at " + N + " " + harmonicValue);
	
	}
}
