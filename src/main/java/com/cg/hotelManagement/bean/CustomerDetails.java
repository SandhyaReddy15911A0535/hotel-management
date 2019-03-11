package com.cg.hotelManagement.bean;

public class CustomerDetails {
private  String CustName;
private String email;
private String CustAdress,status;
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
private String RoomType;
private int RoomNo,MobileNo;
public CustomerDetails(String custName2, String email2, int mobileNo2, String custAdress2, String string, int i) {
	// TODO Auto-generated constructor stub
	CustName=custName2;
	email=email2;
	MobileNo=mobileNo2;
	CustAdress=custAdress2;
	RoomType=string;
	RoomNo=i;
}
public CustomerDetails() {
	// TODO Auto-generated constructor stub
}

public String getCustName() {
	return CustName;
}
public void setCustName(String custName) {
	CustName = custName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getCustAdress() {
	return CustAdress;
}
public void setCustAdress(String custAdress) {
	CustAdress = custAdress;
}
public String getRoomType() {
	return RoomType;
}
public void setRoomType(String roomType) {
	RoomType = roomType;
}
public int getRoomNo() {
	return RoomNo;
}
public void setRoomNo(int roomNo) {
	RoomNo = roomNo;
}
public int getMobileNo() {
	return MobileNo;
}
public void setMobileNo(int mobileNo) {
	MobileNo = mobileNo;
}

	
}
