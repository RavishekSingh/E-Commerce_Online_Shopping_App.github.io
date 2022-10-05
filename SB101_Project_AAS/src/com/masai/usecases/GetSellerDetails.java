package com.masai.usecases;

import java.util.List;

import com.masai.bean.Seller;
import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImpl;
import com.masai.exception.AuctionException;

public class GetSellerDetails {

	public static void main(String[] args) {

		AdminDao ad = new AdminDaoImpl();
		try {
			List<Seller> list = ad.getAllSellerDetails();
			list.forEach(s -> {
				System.out.println("Seller ID is : " + s.getSid());
				System.out.println("Seller Name is : " + s.getName());
				System.out.println("Seller Email is : " + s.getEmail());
				System.out.println("Seller Mobile is : " + s.getMobile());
				System.out.println("Seller Password is : " + s.getPassword());
				System.out.println("-------------------------");
			});
		} catch (AuctionException e) {
			System.out.println(e.getMessage());
		}
		AdminMain.main(args);
	}

}
