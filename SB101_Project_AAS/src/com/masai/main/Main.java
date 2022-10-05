package com.masai.main;

import java.util.Scanner;

import com.masai.usecases.LoginAdminUseCase;
import com.masai.usecases.LoginBuyerUseCase;
import com.masai.usecases.LoginSellerUseCase;
import com.masai.usecases.RegisterBuyerUseCase;
import com.masai.usecases.RegisterSellerUseCase;

public class Main {

	public static void main(String[] args) {

		System.out.println("Welcome to Automated Auction System");
		System.out.println("1. Login as Admin");
		System.out.println("2. Register as Seller");
		System.out.println("3. Login as Seller");
		System.out.println("4. Register as Buyer");
		System.out.println("5. Login as Buyer");
		System.out.println("6. Close the App");

		Scanner sc = new Scanner(System.in);
		int res = sc.nextInt();

		switch (res) {

		case 1:
			LoginAdminUseCase.main(args);
			break;

		case 2:
			RegisterSellerUseCase.main(args);
			break;

		case 3:
			LoginSellerUseCase.main(args);
			break;

		case 4:
			RegisterBuyerUseCase.main(args);
			break;

		case 5:
			LoginBuyerUseCase.main(args);
			break;

		case 6:
			System.out.println("Thanks For Using the App!");

			break;
		}

	}

}
