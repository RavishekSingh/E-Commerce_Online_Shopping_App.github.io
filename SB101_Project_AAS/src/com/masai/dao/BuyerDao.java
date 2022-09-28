package com.masai.dao;

import com.masai.bean.Buyer;

public interface BuyerDao {

	public String registerBuyer(String name, String email, String mobile, String password);

	public String registerBuyer(Buyer buyer);
}
