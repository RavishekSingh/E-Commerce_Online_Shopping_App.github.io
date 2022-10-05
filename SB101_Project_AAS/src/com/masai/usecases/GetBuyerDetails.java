package com.masai.usecases;

import java.util.List;

import com.masai.bean.Buyer;
import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImpl;
import com.masai.exception.AuctionException;

public class GetBuyerDetails {

	public static void main(String[] args) {

		AdminDao ad = new AdminDaoImpl();
		try {
			List<Buyer> list = ad.getAllBuyerDetails();
			list.forEach(s -> {
				System.out.println("Buyer ID is : " + s.getBid());
				System.out.println("Buyer Name is : " + s.getName());
				System.out.println("Buyer Email is : " + s.getEmail());
				System.out.println("Buyer Mobile is : " + s.getMobile());
				System.out.println("Buyer Password is : " + s.getPassword());
				System.out.println("-------------------------");
			});
		} catch (AuctionException e) {
			System.out.println(e.getMessage());
		}
		AdminMain.main(args);
	}

}
