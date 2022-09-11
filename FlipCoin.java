package com.bl.day5;

import java.util.Scanner;

public class FlipCoin {
	public static void main(String[] args) {
		System.out.println("Enter the number of time to flip a coin");
		Scanner sc = new Scanner(System.in);
		
		int numTimes = -5;
		do {
			numTimes = sc.nextInt();
			if (numTimes < 0) {
				System.out.println("This not valid, Enter again");
			}
		} while (numTimes < 0);
		byte headCount = 0;
		byte tailCount = 0;
		
		int numTime = -5;
		for (int i = 0; i < numTime; i++) {
			float random = (float) Math.random();
		if (random < 0.50) {
				System.out.println("T ");
				tailCount++;
			} else {
				System.out.println("H");
				headCount++;
			}
		}
		System.out.println("Head percent" + ((float) headCount / numTimes) *100);
		System.out.println(" Tail percent" + ((float) tailCount / numTimes) *100);
		sc.close();
	}
}
