package com.masai.usecases;

import java.util.Scanner;

import com.masai.main.Main;

public class SellerMain {

	public static void main(String[] args) {

		

		while(true) {
			System.out.println("Select an option to continue");
			System.out.println("1. Create list of items to sell.");
			System.out.println("2. Update Item price, quantity, etc.");
			System.out.println("3. Add new Item in the list.");
			System.out.println("4. Remove items from the list.");
			System.out.println("5. View the sold Item history.");
			System.out.println("6. Main Menu");
			System.out.println("7. Close the App");

			

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
				Main.main(args);
				break;
			case 6:
				Main.main(args);
				break;
				
			case 7:
				System.out.println("Thanks For Using the App!");;
				break;	

			}
			if(choice==7)
				break;
		}
			
		

	}

}
