package com.masai.usecases;

import java.util.Scanner;

import com.masai.bean.Products;
import com.masai.dao.SellerDao;
import com.masai.dao.SellerDaoImpl;

public class RemoveProducts {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Product ID to Remove the Product");
		int pid = sc.nextInt();

		SellerDao dao = new SellerDaoImpl();
		try {
			String res = dao.removeProducts(pid);
			System.out.println(res);
			System.out.println("=====================================");
		} catch (Exception se) {
			se.printStackTrace();
		}

		SellerMain.main(args);
	}

}
