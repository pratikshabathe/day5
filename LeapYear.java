package com.bl.day5;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year to check if its Leap year");
		int year = 2000;
		
		do {
			year = sc.nextInt();
			if ((float) year / 1000 < 1) {
				System.out.println("year must be of four lenth, Enter again");
			}
		}while ((float) year / 1000 < 1);
		sc.close();
		if(year % 4 == 0) {
			System.out.println("Leap year");
		}
		else {
			System.out.println("Not Leap year");
		}
	}
}
