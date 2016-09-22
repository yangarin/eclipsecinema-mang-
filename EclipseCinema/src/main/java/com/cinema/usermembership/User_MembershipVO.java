package com.cinema.usermembership;

public class User_MembershipVO {

	private String C_ID = ""; // 고객 아이디
	private String C_NAME = ""; // 고객이름
	private String C_PW = ""; //  고객 비밀번호
	private String C_PHONE = ""; //  고객 전화번호
	private String C_BIRTH = ""; //  고객 생일
	private String C_GENDER = "";  // 고객 성별
	private int C_MILEAGE = 0; // 고객 마일리지  
	
	public User_MembershipVO(){
		
	}
	
	
	
	public User_MembershipVO(String c_ID, String c_NAME, String c_PW, String c_PHONE, String c_BIRTH, String c_GENDER,
			int c_MILEAGE) {
		super();
		C_ID = c_ID;
		C_NAME = c_NAME;
		C_PW = c_PW;
		C_PHONE = c_PHONE;
		C_BIRTH = c_BIRTH;
		C_GENDER = c_GENDER;
		C_MILEAGE = c_MILEAGE;
	}



	public String getC_ID() {
		return C_ID;
	}
	public void setC_ID(String c_ID) {
		this.C_ID = c_ID;
	}
	
	public String getC_NAME() {
		return C_NAME;
	}

	public void setC_NAME(String c_NAME) {
		this.C_NAME = c_NAME;
	}

	public String getC_PW() {
		return C_PW;
	}
	public void setC_PW(String c_PW) {
		this.C_PW = c_PW;
	}
	public String getC_PHONE() {
		return C_PHONE;
	}
	public void setC_PHONE(String c_PHONE) {
		this.C_PHONE = c_PHONE;
	}
	public String getC_BIRTH() {
		return C_BIRTH;
	}
	public void setC_BIRTH(String c_BIRTH) {
		this.C_BIRTH = c_BIRTH;
	}
	public String getC_GENDER() {
		return C_GENDER;
	}
	public void setC_GENDER(String c_GENDER) {
		this.C_GENDER = c_GENDER;
	}
	public int getC_MILEAGE() {
		return C_MILEAGE;
	}
	public void setC_MILEAGE(int c_MILEAGE) {
		this.C_MILEAGE = c_MILEAGE;
	}
	
	
	
}
