package com.masai.dao;

<<<<<<< HEAD
import java.util.List;

import com.masai.bean.Buyer;
import com.masai.bean.Seller;
import com.masai.exception.AuctionException;

public interface AdminDao {

	public boolean loginAdmin(String name, String password) throws AuctionException;

	public List<Seller> getAllSellerDetails() throws AuctionException;

	public List<Buyer> getAllBuyerDetails() throws AuctionException;
=======
import com.masai.bean.Admin;

public interface AdminDao {

	public String registerAdmin(String name,String email,String password);

	public String registerAdmin2(Admin admin);


>>>>>>> main
}
