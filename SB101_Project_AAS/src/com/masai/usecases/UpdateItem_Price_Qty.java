package com.masai.usecases;

import java.util.Scanner;

import com.masai.bean.Products;
import com.masai.dao.SellerDao;
import com.masai.dao.SellerDaoImpl;
import com.masai.exception.AuctionException;

public class UpdateItem_Price_Qty {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Product ID:");
		int pid = sc.nextInt();

		System.out.println("Enter Product Updated Price:");
		int price = sc.nextInt();

		System.out.println("Enter Product Updated Quantity:");
		int qty = sc.nextInt();

		SellerDao dao = new SellerDaoImpl();

		String result;
		try {
			result = dao.updateItem_Price_Qty(pid, price, qty);
			System.out.println(result);

		} catch (AuctionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("=========================================");
		SellerMain.main(args);
	}

}
