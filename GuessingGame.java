package com.CodersCampus.GuessingGame;

import java.util.Scanner;

import java.util.Random;

public class GuessingGame {

	public static void main (String[] args) {
		
		Random randomNumber = new Random();
		int luckyNumber = randomNumber.nextInt(101);
		int inputs = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(luckyNumber);
		
		System.out.println("Welcome To Jenny's Guessing Game!");
		System.out.println("");
		
		while (inputs <5) {
			
			System.out.print("Pick a number between 1 and 100: ");
			int guess = scanner.nextInt();
			
			if (inputs == 4) {
				System.out.println("Womp womp, you lose.");
				break;
		    } else if (guess <1 || guess >100) {
				System.out.print("Your guess is not between 1 and 100, please try again: ");
			} else if (guess > luckyNumber) {
				System.out.println("Please pick a lower number: ");
				inputs++;
			} else if (guess < luckyNumber) {
				System.out.println("Please pick a higher number: ");
				inputs++;
			} else if (guess == luckyNumber) {
				System.out.println("You Win!!");
				break;
			} 
			
		}
		
		scanner.close();
		
	}
}
