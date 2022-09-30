package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.masai.bean.Seller;
import com.masai.exception.AuctionException;
import com.masai.utility.DBUtil;

public class SellerDaoImpl implements SellerDao {

	@Override
	public String registerSeller(Seller seller) {

		String message = "Not Inserted..";

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn
					.prepareStatement("insert into seller(name,email,mobile,password) values(?,?,?,?)");

			ps.setString(1, seller.getName());
			ps.setString(2, seller.getEmail());
			ps.setString(3, seller.getMobile());
			ps.setString(4, seller.getPassword());

			int x = ps.executeUpdate();

			if (x > 0)
				message = "Seller Registered Sucessfully !";

		} catch (SQLException e) {
			message = e.getMessage();
		}

		return message;
	}

	@Override
	public boolean loginSeller(String name, String password) throws AuctionException {
		
		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("select * from seller where name=? AND password=?");

			ps.setString(1, name);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				System.out.println("Seller Login Succesfull...");
				return true;
			} else {
				throw new AuctionException("Invalid Username or Password");

			}

		} catch (SQLException se) {

			throw new AuctionException(se.getMessage());
		}
	}

}
