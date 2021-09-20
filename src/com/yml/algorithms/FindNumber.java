package com.yml.algorithms;

import java.util.Scanner;

public class FindNumber {
	static Scanner scanner = new Scanner(System.in);
	static int number;

	public static void run(String args) {
		int value = Integer.parseInt(args);
		System.out.println("Enter a number between 0 and " + (value - 1));
		number = scanner.nextInt();
		find(0, value - 1);
	}

	private static void find(int low, int high) {
		if (low == high) {
			System.out.println("Entered number is  " + low);
			System.out.println("Intermediary numbers is " + (low - 1) + " and " + (low + 1));
			return;
		}
		int mid = (low + high) / 2;
		String ch;
		System.out.println("Is your number between " + low + " and " + mid);
		ch = scanner.next();
		if (ch.equalsIgnoreCase("yes")) {
			find(low, mid);
		} else {
			find(mid + 1, high);
		}

	}
}
