package com.masai.usecases;

import java.util.Scanner;

import com.masai.main.Main;

public class AdminMain {

	public static void main(String[] args) {

		System.out.println("Select an option to continue");
		System.out.println("1. Get details of all Sellers");
		System.out.println("2. Get details of all Buyers");
		System.out.println("3. Main Menu");
		System.out.println("4. Close the App");

		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			GetSellerDetails.main(args);
			break;

		case 2:
			GetBuyerDetails.main(args);
			break;
		case 3:
			Main.main(args);
			break;

		case 4:
			System.out.println("Thanks For Using the App!");
			;
			break;

		}

	}

}
