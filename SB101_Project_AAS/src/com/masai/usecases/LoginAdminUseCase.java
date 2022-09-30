package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImpl;
import com.masai.exception.AuctionException;

public class LoginAdminUseCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter AdminName");
		String name = sc.next();
		System.out.println("Enter Password");
		String password = sc.next();

		AdminDao dao = new AdminDaoImpl();
		try {
			boolean x = dao.loginAdmin(name, password);
			System.out.println("Welcome " + name + " !");
			System.out.println("---------------------------------------");
			if (x == true) {
				AdminMain.main(args);
			}
		} catch (AuctionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
