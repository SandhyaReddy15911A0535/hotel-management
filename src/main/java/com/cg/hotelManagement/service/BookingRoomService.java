package com.cg.hotelManagement.service;

import com.cg.hotelManagement.bean.CustomerDetails;

public interface BookingRoomService {
	int BookingRoom(CustomerDetails customerDetails);
	CustomerDetails BookingStatus(int custId);
}
