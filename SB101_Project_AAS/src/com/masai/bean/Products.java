package com.masai.bean;

public class Products {

	private int pid;
	private String pname;
	private int price;
	private int qty;
	private String category;
	private int spid;

	public Products() {
		// TODO Auto-generated constructor stub
	}

	public Products(int pid, String pname, int price, int qty, String category, int spid) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.qty = qty;
		this.category = category;
		this.spid = spid;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getSpid() {
		return spid;
	}

	public void setSpid(int spid) {
		this.spid = spid;
	}

	@Override
	public String toString() {
		return "Products [pid=" + pid + ", pname=" + pname + ", price=" + price + ", qty=" + qty + ", category="
				+ category + ", spid=" + spid + "]";
	}

}
