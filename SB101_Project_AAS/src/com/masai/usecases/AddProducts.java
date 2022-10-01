package com.masai.usecases;

import java.util.Scanner;

import com.masai.bean.Products;
import com.masai.dao.SellerDao;
import com.masai.dao.SellerDaoImpl;

public class AddProducts {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Product Name:");
		String pname = sc.next();

		System.out.println("Enter Product Price:");
		int price = sc.nextInt();

		System.out.println("Enter Product Quantity:");
		int qty = sc.nextInt();

		System.out.println("Enter Product Category:");
		String category = sc.next();

		System.out.println("Enter Seller Id:");
		int spid = sc.nextInt();

		SellerDao dao = new SellerDaoImpl();

		Products prd = new Products();
		prd.setPname(pname);
		prd.setPrice(price);
		prd.setQty(qty);
		prd.setCategory(category);
		prd.setSpid(spid);

		String result = dao.addProducts(prd);

		System.out.println(result);
		System.out.println("=========================================");

		SellerMain.main(args);
	}

}
