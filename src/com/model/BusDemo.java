package com.model;
import java.util.Scanner;
import java.sql.SQLException;
import java.util.ArrayList;
public class BusDemo {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		BusDAO busDAO = new BusDAO();
		busDAO.displayBusInfo();
		
		int userOpt=1;
	
		Scanner s = new Scanner(System.in);
		while(userOpt==1) {
		System.out.println("Enter 1 to book and 2 to exit");
		userOpt = s.nextInt();
		if(userOpt==1) {
			Booking booking = new Booking();
			if(booking.isAvailable()) {
				BookingDAO bookingdao = new BookingDAO();
				bookingdao.addBooking(booking);
				System.out.println("Booking confirmed....");
			}
			else {
				System.out.println("Sorry!!! Bus is Full.Please try Another Bus");
				
			}
		}
		}
		s.close();
	}

}
