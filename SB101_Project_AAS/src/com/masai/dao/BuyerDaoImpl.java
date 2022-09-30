package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.masai.bean.Buyer;
import com.masai.exception.AuctionException;
import com.masai.utility.DBUtil;

public class BuyerDaoImpl implements BuyerDao {

	@Override
	public String registerBuyer(Buyer buyer) {

		String message = "Not Inserted..";

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn
					.prepareStatement("insert into buyer(name,email,mobile,password) values(?,?,?,?)");

			ps.setString(1, buyer.getName());
			ps.setString(2, buyer.getEmail());
			ps.setString(3, buyer.getMobile());
			ps.setString(4, buyer.getPassword());

			int x = ps.executeUpdate();

			if (x > 0)
				message = "Buyer Registered Sucessfully !";

		} catch (SQLException e) {
			message = e.getMessage();
		}

		return message;
	}

	@Override
	public boolean loginBuyer(String name, String password) throws AuctionException {
		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("select * from buyer where name=? AND password=?");

			ps.setString(1, name);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				System.out.println("Buyer Login Succesfull...");
				return true;
			} else {
				throw new AuctionException("Invalid Username or Password");

			}

		} catch (SQLException se) {

			throw new AuctionException(se.getMessage());
		}
	}

}
