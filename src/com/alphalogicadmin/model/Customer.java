package com.alphalogicadmin.model;

public class Customer {
	int cId;
	private String cFirstName;
	private String cLastName;
	private String cEmail;
	private String cPassword;
	private String cImageUrl;
	public String getcImageUrl() {
		return cImageUrl;
	}
	public void setcImageUrl(String cImageUrl) {
		this.cImageUrl = cImageUrl;
	}
	public Customer() {
		super();
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcFirstName() {
		return cFirstName;
	}
	public void setcFirstName(String cFirstName) {
		this.cFirstName = cFirstName;
	}
	public String getcLastName() {
		return cLastName;
	}
	public void setcLastName(String cLastName) {
		this.cLastName = cLastName;
	}
	public String getcEmail() {
		return cEmail;
	}
	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}
	public String getcPassword() {
		return cPassword;
	}
	public void setcPassword(String cPassword) {
		this.cPassword = cPassword;
	}
	

}
