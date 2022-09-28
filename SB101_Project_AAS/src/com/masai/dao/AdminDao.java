package com.masai.dao;

import com.masai.bean.Admin;

public interface AdminDao {

	public String registerAdmin(String name,String email,String password);

	public String registerAdmin2(Admin admin);

}
