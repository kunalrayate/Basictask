package com.Task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BasicCalculator {

	void add() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter First Number: ");
			int num1 = sc.nextInt();
			System.out.print("Enter Second Number: ");
			int num2 = sc.nextInt();
			int sum = num1 + num2;
			System.out.println("Addition is: " + sum);
		} catch (InputMismatchException e) {
			System.out.println("Please enter valid numbers.");
		}
	}

	void sub() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter First Number: ");
			int num1 = sc.nextInt();
			System.out.print("Enter Second Number: ");
			int num2 = sc.nextInt();
			int diff = num1 - num2;
			System.out.println("Subtraction is: " + diff);
		} catch (InputMismatchException e) {
			System.out.println("Please enter valid numbers.");
		}
	}

	void mul() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter First Number: ");
			int num1 = sc.nextInt();
			System.out.print("Enter Second Number: ");
			int num2 = sc.nextInt();
			int product = num1 * num2;
			System.out.println("Multiplication is: " + product);
		} catch (InputMismatchException e) {
			System.out.println("Please enter valid numbers.");
		}
	}

	void div() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter First Number: ");
			int num1 = sc.nextInt();
			System.out.print("Enter Second Number: ");
			int num2 = sc.nextInt();
			try {
				int result = num1 / num2;
				System.out.println("Division is: " + result);
			} catch (ArithmeticException e) {
				System.out.println("Cannot divide by zero.");
			}
		} catch (InputMismatchException e) {
			System.out.println("Please enter valid numbers.");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BasicCalculator calculator = new BasicCalculator();

		while (true) {
			System.out.println("\n=== BASIC CALCULATOR ===");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");

			int choice;
			try {
				choice = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Invalid input. Please enter a number from 1 to 5.");
				sc.next();
				continue;
			}

			switch (choice) {
			case 1:
				calculator.add();
				break;
			case 2:
				calculator.sub();
				break;
			case 3:
				calculator.mul();
				break;
			case 4:
				calculator.div();
				break;
			case 5:
				System.out.println("Thank you for using the calculator.");
				System.exit(0);
			default:
				System.out.println("Invalid choice. Please choose between 1 and 5.");
			}
		}
	}
}
