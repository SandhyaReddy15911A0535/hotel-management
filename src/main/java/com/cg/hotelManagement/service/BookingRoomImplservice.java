package com.cg.hotelManagement.service;

import com.cg.hotelManagement.bean.CustomerDetails;
import com.cg.hotelManagement.dao.*;

public class BookingRoomImplservice implements BookingRoomService {
	BookingRoom br =new BookingRoomImpl();

	public int BookingRoom(CustomerDetails customerDetails) {
		// TODO Auto-generated method stub
	
		return br.BookingRoom(customerDetails);
	}

	public CustomerDetails BookingStatus(int custId) {
		// TODO Auto-generated method stub
	
		return br.BookingStatus(custId);
	}

}
