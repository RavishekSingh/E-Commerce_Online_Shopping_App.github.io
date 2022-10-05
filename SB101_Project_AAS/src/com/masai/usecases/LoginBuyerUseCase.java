package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImpl;
import com.masai.dao.BuyerDao;
import com.masai.dao.BuyerDaoImpl;
import com.masai.dao.SellerDao;
import com.masai.dao.SellerDaoImpl;
import com.masai.exception.AuctionException;

public class LoginBuyerUseCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter BuyerName");
		String name = sc.next();
		System.out.println("Enter Password");
		String password = sc.next();

		BuyerDao dao = new BuyerDaoImpl();
		try {
			boolean x = dao.loginBuyer(name, password);
			System.out.println("Welcome " + name + " !");
			System.out.println("---------------------------------------");
			if (x == true) {
				BuyerMain.main(args);
			}
		} catch (AuctionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			BuyerMain.main(args);
		}

	}

}
