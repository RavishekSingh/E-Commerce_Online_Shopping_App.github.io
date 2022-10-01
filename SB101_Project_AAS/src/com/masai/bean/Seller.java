package com.masai.bean;

public class Seller {

	private int sid;
	private String name;
	private String email;
	private String mobile;
	private String password;
	
	public Seller() {
		// TODO Auto-generated constructor stub
	}

	public Seller(int sid, String name, String email, String mobile, String password) {
		super();
		this.sid = sid;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Seller [sid=" + sid + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", password="
				+ password + "]";
	}



	
}
