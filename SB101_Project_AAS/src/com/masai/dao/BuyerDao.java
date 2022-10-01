package com.masai.dao;

import java.util.List;

import com.masai.bean.Buyer;
import com.masai.bean.Products;
import com.masai.bean.SellerDTO;
import com.masai.exception.AuctionException;

public interface BuyerDao {

	public String registerBuyer(Buyer buyer);
	public boolean loginBuyer(String name, String password) throws AuctionException;
	public List<Products> viewItemByCategory(String category) throws AuctionException ;
	public List<SellerDTO> viewSellersByItemCategory(String category) throws AuctionException ;
	public String buyProducts(String pname,int qty) throws AuctionException;

}
