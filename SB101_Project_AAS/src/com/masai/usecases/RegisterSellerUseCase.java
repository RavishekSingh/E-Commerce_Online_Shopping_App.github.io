package com.masai.usecases;

import java.util.Scanner;

import com.masai.bean.Seller;
import com.masai.dao.SellerDao;
import com.masai.dao.SellerDaoImpl;
import com.masai.main.Main;

public class RegisterSellerUseCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Seller Name:");
		String sname = sc.next();

		System.out.println("Enter Seller Email:");
		String email = sc.next();

		System.out.println("Enter Seller Mobile Number:");
		String mobile = sc.next();

		System.out.println("Enter Seller password:");
		String password = sc.next();

		SellerDao dao = new SellerDaoImpl();

		Seller seller = new Seller();
		seller.setName(sname);
		seller.setEmail(email);
		seller.setMobile(mobile);
		seller.setPassword(password);

		String result = dao.registerSeller(seller);

		System.out.println(result);
		System.out.println("=========================================");
		
		if(result!=null) {
			Main.main(args);
		}

	}

}
