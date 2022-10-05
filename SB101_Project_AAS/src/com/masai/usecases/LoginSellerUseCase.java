package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImpl;
import com.masai.dao.SellerDao;
import com.masai.dao.SellerDaoImpl;
import com.masai.exception.AuctionException;

public class LoginSellerUseCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter SellerName");
		String name = sc.next();
		System.out.println("Enter Password");
		String password = sc.next();

		SellerDao dao = new SellerDaoImpl();
		try {
			boolean x = dao.loginSeller(name, password);
			System.out.println("Welcome " + name + " !");
			System.out.println("---------------------------------------");
			if (x == true) {
				SellerMain.main(args);
			}
		} catch (AuctionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			SellerMain.main(args);
		}

	}

}
