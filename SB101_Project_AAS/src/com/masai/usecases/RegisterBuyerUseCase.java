package com.masai.usecases;

import java.util.Scanner;

import com.masai.bean.Buyer;
import com.masai.dao.BuyerDao;
import com.masai.dao.BuyerDaoImpl;
import com.masai.main.Main;

public class RegisterBuyerUseCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Buyer Name:");
		String bname = sc.next();

		System.out.println("Enter Buyer Email:");
		String email = sc.next();

		System.out.println("Enter Buyer Mobile Number:");
		String mobile = sc.next();

		System.out.println("Enter Buyer password:");
		String password = sc.next();

		BuyerDao dao = new BuyerDaoImpl();

		Buyer buyer = new Buyer();
		buyer.setName(bname);
		buyer.setEmail(email);
		buyer.setMobile(mobile);
		buyer.setPassword(password);

		String result = dao.registerBuyer(buyer);

		System.out.println(result);
		System.out.println("=======================================");
		
		if(result!=null) {
			Main.main(args);
		}
	}

}
