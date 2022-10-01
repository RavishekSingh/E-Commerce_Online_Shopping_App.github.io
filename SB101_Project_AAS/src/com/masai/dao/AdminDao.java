package com.masai.dao;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> main
import java.util.List;

import com.masai.bean.Buyer;
import com.masai.bean.Seller;
import com.masai.exception.AuctionException;
<<<<<<< HEAD
=======

public interface AdminDao {

	public boolean loginAdmin(String name, String password) throws AuctionException;

	public List<Seller> getAllSellerDetails() throws AuctionException;

	public List<Buyer> getAllBuyerDetails() throws AuctionException;
=======
import com.masai.bean.Admin;
>>>>>>> main

public interface AdminDao {

	public boolean loginAdmin(String name, String password) throws AuctionException;

	public List<Seller> getAllSellerDetails() throws AuctionException;

<<<<<<< HEAD
	public List<Buyer> getAllBuyerDetails() throws AuctionException;
=======
>>>>>>> main
>>>>>>> main
}
