package com.masai.dao;

import com.masai.bean.Buyer;
import com.masai.exception.AuctionException;

public interface BuyerDao {

	public String registerBuyer(Buyer buyer);
	public boolean loginBuyer(String name, String password) throws AuctionException;


}
