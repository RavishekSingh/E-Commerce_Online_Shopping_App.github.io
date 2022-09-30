package com.masai.dao;

import java.util.List;

import com.masai.bean.Buyer;
import com.masai.bean.Seller;
import com.masai.exception.AuctionException;

public interface AdminDao {

	public boolean loginAdmin(String name, String password) throws AuctionException;

	public List<Seller> getAllSellerDetails() throws AuctionException;

	public List<Buyer> getAllBuyerDetails() throws AuctionException;
}
