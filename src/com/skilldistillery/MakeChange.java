package com.skilldistillery;

import java.util.Scanner;
import java.text.DecimalFormat;

public class MakeChange {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		DecimalFormat cents = new DecimalFormat("0.00");

		double price = 0.0;
		double payment = 0.0;
		double change = 0.0;

		System.out.println("Greetings, valued customer. Welcome to the Cash Register!");
		System.out.println("");
		System.out.print("Please enter the price of your item: ");

		price = keyboard.nextDouble();

		System.out.println("\nThank you!");
		System.out.println("");
		System.out.print("Please enter how much you are paying: ");

		payment = keyboard.nextDouble();

		change = payment - price;

		if (change < 1 && !(change < 0) && !(change == 0)) {
			System.out.println("\nLooks like you will be getting " + (cents.format(change)) + " cents back!");
			changeCalculator(change);
		} else if (change > 1 && !(change < 0) && !(change == 0)) {
			System.out.println("\nLooks like you will be getting $" + (cents.format(change)) + " back!");
			changeCalculator(change);
		}
		while (payment < price) {
			System.out.println(
					"\nI'm sorry but that isn't enough money. \n\nCome back when you have enough and try again!");
			break;
		}
		while (change == 0) {
			System.out.println("\nWow! That's the exact amount owed. No change necessary.");
			System.out.println("\nThank you for shopping!");
			System.out.println("\nHave a nice day!");
			break;
		}

	}

	public static void changeCalculator(double change) {

		int pennies, nickels, dimes, quarters, ones, fives, tens, twenties;

		System.out.println("\nLet's see how much that is in bills and coins.");

		System.out.println("\n...calculating...");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ex) {
		}

		System.out.println("\n...calculating...");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ex) {
		}
		System.out.println("");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ex) {
		}
		System.out.println(".................");

		// twenties change
		while (change >= 20) {
			twenties = 0;
			twenties = (int) (change / 20);
			change = change % 20;

			if (twenties == 1 && !(twenties > 1)) {
				System.out.println("");
				System.out.println(twenties + " twenty dollar bill");
				break;
			} else if (twenties > 1) {
				System.out.println("");
				System.out.println(twenties + " twenty dollar bills");
				break;
			}
		}

		// tens change
		while (change >= 10) {
			tens = 0;
			tens = (int) (change / 10);
			change = change % 10;

			if (tens == 1 && !(tens > 1)) {
				System.out.println("");
				System.out.println(tens + " ten dollar bill");
				break;
			} else if (tens > 1) {
				System.out.println("");
				System.out.println(tens + " ten dollar bills");
				break;
			}
		}

		// fives change
		while (change >= 5) {
			fives = 0;
			fives = (int) (change / 5);
			change = change % 5;

			if (fives == 1 && !(fives > 1)) {
				System.out.println("");
				System.out.println(fives + " five dollar bill");
				break;
			} else if (fives > 1) {
				System.out.println("");
				System.out.println(fives + " five dollar bills");
				break;
			}
		}
		// ones change
		while (change >= 1) {
			ones = 0;
			ones = (int) (change / 1);
			change = change % 1;

			if (ones == 1 && !(ones > 1)) {
				System.out.println("");
				System.out.println(ones + " one dollar bill");
				break;
			} else if (ones > 1) {
				System.out.println("");
				System.out.println(ones + " one dollar bills");
				break;
			}
		}
		// quarters change
		while (change >= .25) {
			quarters = 0;
			quarters = (int) (change / .25);
			change = change % .25;

			if (quarters == 1 && !(quarters > 1)) {
				System.out.println("");
				System.out.println(quarters + " quarter");
				break;
			} else if (quarters > 1) {
				System.out.println("");
				System.out.println(quarters + " quarters");
				break;
			}
		}
		// dimes change
		while (change >= .10) {
			dimes = 0;
			dimes = (int) (change / .10);
			change = change % .10;

			if (dimes == 1 && !(dimes > 1)) {
				System.out.println("");
				System.out.println(dimes + " dime");
				break;
			} else if (dimes > 1) {
				System.out.println("");
				System.out.println(dimes + " dimes");
				break;
			}
		}
		// nickels change
		while (change >= .05) {
			nickels = 0;
			nickels = (int) (change / .05);
			change = change % .05;

			if (nickels == 1 && !(nickels > 1)) {
				System.out.println("");
				System.out.println(nickels + " nickel");
				break;
			} else if (nickels > 1) {
				System.out.println("");
				System.out.println(nickels + " nickels");
				break;
			}
		}
		// pennies change
		while (change >= .01) {
			pennies = 0;
			pennies = (int) (change / .01);
			change = change % .01;

			if (pennies == 1 && !(pennies > 1)) {
				pennies = 1;
				System.out.println("");
				System.out.println(pennies + " penny");
				break;
			} else if (pennies > 1 && ! (pennies == 1)) {
				pennies = pennies + 1;
				System.out.println("");
				System.out.println(pennies + " pennies");
				break;
			}
		}
	}
}