package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.bean.Buyer;
import com.masai.bean.Seller;
import com.masai.exception.AuctionException;
import com.masai.utility.DBUtil;

public class AdminDaoImpl implements AdminDao {

	@Override
	public boolean loginAdmin(String name, String password) throws AuctionException {

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("select * from admin where name=? AND password=?");

			ps.setString(1, name);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				System.out.println("Admin Login Succesfull...");
				return true;
			} else {
				throw new AuctionException("Invalid Username or Password");

			}

		} catch (SQLException se) {

			throw new AuctionException(se.getMessage());
		}

	}

	@Override
	public List<Seller> getAllSellerDetails() throws AuctionException {

		List<Seller> list = new ArrayList<>();

		try (Connection conn = DBUtil.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement("select * from seller");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int sid = rs.getInt("sid");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String mobile = rs.getString("mobile");
				String password = rs.getString("password");
				list.add(new Seller(sid, name, email, mobile, password));
			}
		} catch (SQLException se) {
			throw new AuctionException(se.getMessage());
		}
		if (list.size() == 0) {
			throw new AuctionException("No Seller Found...");
		}
		return list;
	}

	@Override
	public List<Buyer> getAllBuyerDetails() throws AuctionException {
	
		List<Buyer> list = new ArrayList<>();

		try (Connection conn = DBUtil.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement("select * from buyer");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int bid = rs.getInt("bid");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String mobile = rs.getString("mobile");
				String password = rs.getString("password");
				list.add(new Buyer( bid, name,  email,  mobile,  password));
			}
		} catch (SQLException se) {
			throw new AuctionException(se.getMessage());
		}
		if (list.size() == 0) {
			throw new AuctionException("No Buyer Found...");
		}
		return list;
	}

}
