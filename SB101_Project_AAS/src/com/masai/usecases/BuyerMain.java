package com.masai.usecases;

import java.util.Scanner;

import com.masai.main.Main;

public class BuyerMain {

	public static void main(String[] args) {

		System.out.println("Select an option to continue");
		System.out.println("1. Search and view Items by category.");
		System.out.println("2. Select and view all the sellers and also their Items category wise.");
		System.out.println("3. Selects Items to buy.");
		System.out.println("4. Main Menu");
		System.out.println("5. Close the App");

		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			ViewItemsByCategory.main(args);
			break;

		case 2:
			ViewSellerByItemCategory.main(args);
			break;
		case 3:
			BuyProducts.main(args);
			break;

		case 4:
			Main.main(args);
			break;

		case 5:
			System.out.println("Thanks For Using the App!");
			;
			break;

		}

	}

}
