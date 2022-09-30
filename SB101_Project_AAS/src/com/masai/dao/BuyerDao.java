package com.masai.dao;

import com.masai.bean.Buyer;
<<<<<<< HEAD
import com.masai.exception.AuctionException;

public interface BuyerDao {

	public String registerBuyer(Buyer buyer);
	public boolean loginBuyer(String name, String password) throws AuctionException;


=======

public interface BuyerDao {

	public String registerBuyer(String name, String email, String mobile, String password);

	public String registerBuyer(Buyer buyer);
>>>>>>> main
}
