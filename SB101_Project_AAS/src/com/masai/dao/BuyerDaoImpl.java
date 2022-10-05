package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.bean.Buyer;
import com.masai.bean.Products;
import com.masai.bean.SellerDTO;
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

	@Override
	public List<Products> viewItemByCategory(String category) throws AuctionException {

		List<Products> list = new ArrayList<>();

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("select * from products where category = ?");

			ps.setString(1, category);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				int pid = rs.getInt("pid");
				String pname = rs.getString("pname");
				int price = rs.getInt("price");
				int qty = rs.getInt("qty");
				String category1 = rs.getString("category");
				int spid = rs.getInt("spid");

				list.add(new Products(pid, pname, price, qty, category1, spid));

			}

		} catch (SQLException se) {
			throw new AuctionException(se.getMessage());
		}
		if (list.size() == 0) {
			throw new AuctionException("No Product Found...");
		}
		return list;
	}

	@Override
	public List<SellerDTO> viewSellersByItemCategory(String category) throws AuctionException {
		List<SellerDTO> list = new ArrayList<>();

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("select s.sid,s.name,p.pname from seller s "
					+ "INNER JOIN products p ON p.spid=s.sid AND p.category= ?");

			ps.setString(1, category);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				int sid = rs.getInt("sid");
				String sname = rs.getString("name");
				String pname = rs.getString("pname");

				list.add(new SellerDTO(sid, sname, pname));

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
	public String buyProducts(String pname, int qty) throws AuctionException {

		String message = "Cannot Buy";

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("select qty from products where pname=?");

			ps.setString(1, pname);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				int nqty = rs.getInt("qty");
				if (nqty < qty)
					message = "Insufficient Quantity. Available Quantity is "+nqty;
				else {

					nqty = nqty - qty;
					PreparedStatement ps1 = conn.prepareStatement("update products set qty=? where pname=?");

					ps1.setInt(1, nqty);
					ps1.setString(2, pname);

					int rs1 = ps1.executeUpdate();

					if (rs1 > 0) {
						message = "Product " + pname + " Quantity " + qty + " Purchased Succesfully...";
					}
				}

			}

		} catch (SQLException se) {

			throw new AuctionException(se.getMessage());
		}
		return message;
	}

}
