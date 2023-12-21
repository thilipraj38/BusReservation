package com.model;
import java.util.*;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Booking {
	String passengerName;
	int busNo;
	Date date;
	Booking(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Passenger name");
		passengerName = s.next();
		System.out.println("Enter Bus No");
		busNo = s.nextInt();
		System.out.println("Enter a travel date dd-MM-yyyy");
		String dateInput = s.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		try {
			date = dateFormat.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		public boolean isAvailable()throws SQLException{
			
			BusDAO busdao = new BusDAO();
			BookingDAO bookingdao = new BookingDAO();
			int capacity = busdao.getCapacity(busNo);
			int booked = bookingdao.getBookedCount(busNo,date);
			
			return booked<capacity;
		
	}
		
}
