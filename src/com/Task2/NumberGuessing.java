package com.Task2;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int numberToGuess = rand.nextInt(100) + 1;
		int maxAttempts = 5;
		int attempts = 0;
		boolean hasWon = false;

		System.out.println("Welcome to the Number Guessing Game!");
		System.out.println("I'm thinking of a number between 1 and 100.");
		System.out.println("You have " + maxAttempts + " attempts to guess it.\n");

		while (attempts < maxAttempts) {
			System.out.print("Enter your guess: ");

			try {
				int userGuess = sc.nextInt();
				attempts++;

				if (userGuess < 1 || userGuess > 100) {
					System.out.println("Please guess a number between 1 and 100.");
					continue;
				}

				if (userGuess == numberToGuess) {
					hasWon = true;
					break;
				} else if (userGuess < numberToGuess) {
					System.out.println("Too low");
				} else {
					System.out.println("Too high");
				}

				System.out.println("Attempts left: " + (maxAttempts - attempts));

			} catch (InputMismatchException e) {
				System.out.println("Invalid input! Please enter an integer.");
				sc.next();
			}
		}

		if (hasWon) {
			System.out.println("\nCongratulations! You guessed the number in " + attempts + " attempts.");
		} else {
			System.out.println("\nYou've used all attempts. The number was: " + numberToGuess);
		}

		System.out.println("Thanks for playing!");
	}
}
