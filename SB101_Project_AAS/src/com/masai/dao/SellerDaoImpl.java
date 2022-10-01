package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.masai.bean.Products;
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

	@Override
	public String createProductsList(Products prd) {

		String message = "Not Inserted..";

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn
					.prepareStatement("insert into products(pname,price,qty,category,spid) values(?,?,?,?,?)");

			ps.setString(1, prd.getPname());
			ps.setInt(2, prd.getPrice());
			ps.setInt(3, prd.getQty());
			ps.setString(4, prd.getCategory());
			ps.setInt(5, prd.getSpid());

			int x = ps.executeUpdate();

			if (x > 0)
				message = "Products List Created Sucessfully !";

		} catch (SQLException e) {
			message = e.getMessage();
		}

		return message;
	}

	@Override
	public String updateItem_Price_Qty(int pid, int price, int qty) throws AuctionException {

		String message = "Cannot Update";
		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("update products set price=?, qty=? where pid=?");

			ps.setInt(1, price);
			ps.setInt(2, qty);
			ps.setInt(3, pid);

			int rs = ps.executeUpdate();

			if (rs > 0) {
				message = "Product Price and Quantity Updated Succesfully...";

			}

		} catch (SQLException se) {

			throw new AuctionException(se.getMessage());
		}
		return message;
	}

	@Override
	public String addProducts(Products prd) {
		String message = "Not Inserted..";

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn
					.prepareStatement("insert into products(pname,price,qty,category,spid) values(?,?,?,?,?)");

			ps.setString(1, prd.getPname());
			ps.setInt(2, prd.getPrice());
			ps.setInt(3, prd.getQty());
			ps.setString(4, prd.getCategory());
			ps.setInt(5, prd.getSpid());

			int x = ps.executeUpdate();

			if (x > 0)
				message = "Products  Added Sucessfully !";

		} catch (SQLException e) {
			message = e.getMessage();
		}

		return message;
	}

	@Override
	public String removeProducts(int pid) throws AuctionException {

		String message = "Product not found...";

		try (Connection conn = DBUtil.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement("delete from products where pid=?");
			ps.setInt(1, pid);
			int rs = ps.executeUpdate();
			if (rs > 0) {
				return "Product Removed from Products List";
			}
		} catch (SQLException se) {
			throw new AuctionException(se.getMessage());
		}

		return message;
	}

}
