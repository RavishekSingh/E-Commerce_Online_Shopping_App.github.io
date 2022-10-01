package com.masai.dao;

import com.masai.bean.Products;
import com.masai.bean.Seller;
import com.masai.exception.AuctionException;

public interface SellerDao {

	public String registerSeller(Seller seller);
	public boolean loginSeller(String name, String password) throws AuctionException;
	public String createProductsList(Products prd);
	public String updateItem_Price_Qty(int pid,int price,int qty) throws AuctionException;
	public String addProducts(Products prd);
	public String removeProducts(int pid) throws AuctionException;
}
