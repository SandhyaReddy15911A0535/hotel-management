package com.cg.hotelManagement.dao;

import com.cg.hotelManagement.bean.CustomerDetails;
import com.cg.hotelManagement.bean.RoomDetails;

public interface BookingRoom {

	int BookingRoom(CustomerDetails customerDetails);
	CustomerDetails BookingStatus(int custId);
	
}
