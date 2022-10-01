package com.masai.bean;

public class SellerDTO {

	private int sid;
	private String sname;
	private String pname;
	
	public SellerDTO() {
		// TODO Auto-generated constructor stub
	}

	public SellerDTO(int sid, String sname, String pname) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.pname = pname;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}
	
}
