package com.Task3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FactorialCalculator {

	public static long factorial(int num) {
		if (num == 0 || num == 1) {
			return 1;
		}
		return num * factorial(num - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Enter a number to calculate factorial: ");
			int number = sc.nextInt();

			if (number < 0) {
				System.out.println("Factorial is not defined for negative numbers.");
			} else {
				long result = factorial(number);
				System.out.println("Factorial of " + number + " is : " + result);
			}
		} catch (InputMismatchException e) {
			System.out.println("Invalid input! Please enter a valid integer.");
		}
	}
}
