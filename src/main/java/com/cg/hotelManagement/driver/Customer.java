package com.cg.hotelManagement.driver;

import java.util.Scanner;

import com.cg.hotelManagement.bean.CustomerDetails;
import com.cg.hotelManagement.service.BookingRoomImplservice;
import com.cg.hotelManagement.service.BookingRoomService;

public class Customer {
	 static CustomerDetails customerDetails=new CustomerDetails();
	 static BookingRoomService brs =new BookingRoomImplservice();
	// static CustomerDetails c1=new CustomerDetails();
	 static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
do {
		System.out.println("enter 1 for Booking Room\n 2 for Konwing Status\n 3 for exit");
		int ch=sc.nextInt();
		
		switch(ch)
		{
		
		case 1:System.out.println("enter the customer name");
		String CustName=sc.next();
		System.out.println("enter email");
		String email=sc.next();
		System.out.println("enter customer address");
		String CustAdress=sc.next();	
		System.out.println("enter mobile number");
		int MobileNo=sc.nextInt();
		System.out.println("enter room number");
		int RoomNo=sc.nextInt();
		System.out.println("enter room type");
		String roomType=sc.next();
		customerDetails.setCustName(CustName);
		customerDetails.setEmail(email);
		customerDetails.setCustAdress(CustAdress);
		customerDetails.setMobileNo(MobileNo);
		customerDetails.setRoomNo(RoomNo);
		customerDetails.setRoomType(roomType);
		int id=brs.BookingRoom(customerDetails);
		System.out.println("successfully Registered with custm id "+id);
		break;
		
		case 2:
			System.out.println("enter customer id");
			int custId=sc.nextInt();
			customerDetails=brs.BookingStatus(custId);
			if(customerDetails!=null)
			{
			System.out.println("name: "+customerDetails.getCustName());
			System.out.println("room type: "+customerDetails.getRoomType());
			System.out.println("room No: "+customerDetails.getRoomNo());
			System.out.println("booking status:"+customerDetails.getStatus());
			break;
			}
			case 3:System.exit(0);
		}

	}
while(true);

}
}
