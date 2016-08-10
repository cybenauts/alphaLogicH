package com.alphalogicadmin.model;

public class Supplier {

	public Supplier() {
		// TODO Auto-generated constructor stub
	}
	
	private String sId;
	private String sFirstName;
	private String sLastName;
	private String sEmail;
	private String sPassword;
	private String sImageUrl;
	private String sCompanyName;
	private SupplierPersonalInfo info;
	
	public String getsId() {
		return sId;
	}
	public void setsId(String sId) {
		this.sId = sId;
	}
	public String getsFirstName() {
		return sFirstName;
	}
	public void setsFirstName(String sFirstName) {
		this.sFirstName = sFirstName;
	}
	public String getsLastName() {
		return sLastName;
	}
	public void setsLastName(String sLastName) {
		this.sLastName = sLastName;
	}
	public String getsEmail() {
		return sEmail;
	}
	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}
	public String getsPassword() {
		return sPassword;
	}
	public void setsPassword(String sPassword) {
		this.sPassword = sPassword;
	}
	public String getsImageUrl() {
		return sImageUrl;
	}
	public void setsImageUrl(String sImageUrl) {
		this.sImageUrl = sImageUrl;
	}
	public String getsCompanyName() {
		return sCompanyName;
	}
	public void setsCompanyName(String sCompanyName) {
		this.sCompanyName = sCompanyName;
	}
	public SupplierPersonalInfo getInfo() {
		return info;
	}
	public void setInfo(SupplierPersonalInfo info) {
		this.info = info;
	}
	
	
}
