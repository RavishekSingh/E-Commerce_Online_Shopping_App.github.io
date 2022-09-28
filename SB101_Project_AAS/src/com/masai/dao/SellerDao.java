package com.masai.dao;

import com.masai.bean.Seller;

public interface SellerDao {

	public String registerSeller(String name, String email, String mobile, String password);

	public String registerSeller(Seller seller);
}
