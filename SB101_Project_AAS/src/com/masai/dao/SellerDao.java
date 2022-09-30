package com.masai.dao;

import com.masai.bean.Seller;
<<<<<<< HEAD
import com.masai.exception.AuctionException;

public interface SellerDao {

	public String registerSeller(Seller seller);
	public boolean loginSeller(String name, String password) throws AuctionException;

=======

public interface SellerDao {

	public String registerSeller(String name, String email, String mobile, String password);

	public String registerSeller(Seller seller);
>>>>>>> main
}
