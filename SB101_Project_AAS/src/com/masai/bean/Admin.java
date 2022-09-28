package com.masai.bean;

public class Admin {

	private int adminid;
	private String name;
	private String email;
	private String password;

	public Admin() {
		// TODO Auto-generated constructor stub
	}

	public Admin(int adminid, String name, String email, String password) {
		super();
		this.adminid = adminid;
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public int getAdminid() {
		return adminid;
	}

	public void setAdminid(int adminid) {
		this.adminid = adminid;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Admin [adminid=" + adminid + ", name=" + name + ", email=" + email + ", password=" + password + "]";
	}

}
