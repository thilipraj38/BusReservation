package com.model;

public class Bus {
	private int busNo;
	private boolean ac;
	private int capacity;
	Bus(int busNo,boolean ac,int capacity){
		this.busNo=busNo;
		this.ac=ac;
		this.capacity=capacity;
		
	}
	
	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}
	public int getBusNo() {
		return busNo;
	}

	public boolean isAc() {
		return ac;
	}

	public void setAc(boolean ac) {
		this.ac = ac;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public void displayBusInfo() {
		System.out.println("Bus no "+busNo+" Ac " + ac+" capacity "+capacity);
	}
}
