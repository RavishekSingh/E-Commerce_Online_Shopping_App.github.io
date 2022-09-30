package com.masai.dao;

import com.masai.bean.Seller;
import com.masai.exception.AuctionException;

public interface SellerDao {

	public String registerSeller(Seller seller);
	public boolean loginSeller(String name, String password) throws AuctionException;

}
