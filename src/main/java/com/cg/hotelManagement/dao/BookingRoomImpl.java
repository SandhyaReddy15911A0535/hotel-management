package com.cg.hotelManagement.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import com.cg.hotelManagement.bean.CustomerDetails;
import com.cg.hotelManagement.bean.RoomDetails;
import com.cg.hotelManagement.driver.Customer;

import Exception.IDNotContains;


 public class BookingRoomImpl  implements BookingRoom{
	 HashMap<Integer,RoomDetails> m=new HashMap<Integer,RoomDetails>();
	 HashMap<Integer,CustomerDetails> hm=new HashMap<Integer,CustomerDetails>();
CustomerDetails customerDetails=new CustomerDetails();
	 Scanner sc=new Scanner(System.in);
	 int custId=1000;
	
	 public BookingRoomImpl()
	{
	m.put(101, new RoomDetails("ac_single","notbooked"));
	m.put(102, new RoomDetails("ac_single","notbooked"));
	m.put(103, new RoomDetails("ac_double","notbooked"));
	m.put(104, new RoomDetails("non_ac single","notbooked"));
	m.put(105, new RoomDetails("non_ac single","notbooked"));
	m.put(106, new RoomDetails("non_ac double","notbooked"));
	}
	
	public int BookingRoom(CustomerDetails customerDetails) {
		
		if(m.containsKey(customerDetails.getRoomNo()))
				{
			++custId;
			hm.put(custId,new CustomerDetails(customerDetails.getCustName(),customerDetails.getEmail(),customerDetails.getMobileNo(),customerDetails.getCustAdress(),customerDetails.getRoomType(),customerDetails.getRoomNo()));
		//	m.replace(customerDetails.getRoomNo(),new RoomDetails(customerDetails.getRoomType(),"booked"));
			return custId;
				}
		else
		{
			try {
				throw new IDNotContains();
			} catch (IDNotContains e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return 0;
		}
	
		}
 

	public CustomerDetails BookingStatus(int custId) {
		
		if(hm.containsKey(custId))
		{
			customerDetails=hm.get(custId);
			customerDetails.setStatus("booked");
			
		}
		
		return customerDetails;
	}

	
 
	
 }

	

	

