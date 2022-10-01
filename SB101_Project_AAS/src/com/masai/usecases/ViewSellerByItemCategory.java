package com.masai.usecases;

import java.util.List;
import java.util.Scanner;

import com.masai.bean.Products;
import com.masai.bean.SellerDTO;
import com.masai.dao.BuyerDao;
import com.masai.dao.BuyerDaoImpl;
import com.masai.exception.AuctionException;

public class ViewSellerByItemCategory {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Product Category");
		String category = sc.next();

		BuyerDao ad = new BuyerDaoImpl();
		try {
			List<SellerDTO> list = ad.viewSellersByItemCategory(category);
			list.forEach(s -> {
				System.out.println("Seller ID is : " + s.getSid());
				System.out.println("Seller Name is : " + s.getSname());
				System.out.println("Product Name is : " + s.getPname());
				
				System.out.println("-------------------------");
			});
		} catch (AuctionException e) {
			System.out.println(e.getMessage());
		}

		BuyerMain.main(args);

	}

}
