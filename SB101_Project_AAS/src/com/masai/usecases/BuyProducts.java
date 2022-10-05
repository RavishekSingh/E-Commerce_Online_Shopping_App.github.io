package com.masai.usecases;

import java.util.Scanner;

import com.masai.bean.Products;
import com.masai.dao.BuyerDao;
import com.masai.dao.BuyerDaoImpl;
import com.masai.dao.SellerDao;
import com.masai.dao.SellerDaoImpl;
import com.masai.exception.AuctionException;

public class BuyProducts {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Product Name:");
		String pname = sc.nextLine();
		
		System.out.println("Enter Buy Quantity:");
		int qty = sc.nextInt();

		BuyerDao dao = new BuyerDaoImpl();

		String result;
		try {
			result = dao.buyProducts(pname,qty);
			System.out.println(result);

		} catch (AuctionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("=========================================");
		BuyerMain.main(args);
	}

}
