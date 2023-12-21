package com.model;

import java.util.Date;
import java.sql.*;
public class BookingDAO {
	public int getBookedCount(int busNo,Date date)throws SQLException{
		Connection con = DBConnection.getConnection();
		String query = "Select count(passenger_name) from booking where busno=? and date=?";
		PreparedStatement pst = con.prepareStatement(query);
		pst.setInt(1,busNo);
		java.sql.Date sqlDate = new java.sql.Date(date.getTime());
		pst.setDate(2,sqlDate);
		ResultSet rs = pst.executeQuery();
		rs.next();
		return rs.getInt(1);
		
	}
	public void addBooking(Booking booking)throws SQLException{
		String query = "insert into booking values(?,?,?)";
		Connection con = DBConnection.getConnection();
		PreparedStatement pst = con.prepareStatement(query);
		pst.setInt(2,booking.busNo);
		pst.setString(1,booking.passengerName);
		java.sql.Date sqlDate = new java.sql.Date(booking.date.getTime());
		pst.setDate(3, sqlDate);
		pst.executeUpdate();
	}
}
