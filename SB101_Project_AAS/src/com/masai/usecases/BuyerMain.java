package com.masai.usecases;

import java.util.Scanner;

import com.masai.main.Main;

public class BuyerMain {

	public static void main(String[] args) {

		while(true) {
			System.out.println("Select an option to continue");
			System.out.println("1. Search and view Items by category.");
			System.out.println("2. Select and view all the buyers and also their Items category wise.");
			System.out.println("3. Selects Items to buy.");
			System.out.println("4. Main Menu");
			System.out.println("5. Close the App");


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
				Main.main(args);
				break;
				
			case 5:
				System.out.println("Thanks For Using the App!");;
				break;	

			}
			if(choice==7)
				break;
		}

	}

}
