package com.masai.usecases;

import java.util.List;
import java.util.Scanner;

import com.masai.bean.Products;
import com.masai.dao.BuyerDao;
import com.masai.dao.BuyerDaoImpl;
import com.masai.exception.AuctionException;

public class ViewItemsByCategory {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Product Category");
		String category = sc.next();

		BuyerDao ad = new BuyerDaoImpl();
		try {
			List<Products> list = ad.viewItemByCategory(category);
			list.forEach(s -> {
				System.out.println("Product ID is : " + s.getPid());
				System.out.println("Product Name is : " + s.getPname());
				System.out.println("Product Price is : " + s.getPrice());
				System.out.println("Product Quantity is : " + s.getQty());
				System.out.println("Seller ID is : " + s.getSpid());
				System.out.println("-------------------------");
			});
		} catch (AuctionException e) {
			System.out.println(e.getMessage());
		}

		BuyerMain.main(args);
	}

}
