package com.ltanner.inventoryManagement.util;

public enum MembershipLevel {
	
	SILVER(.05),
	GOLD(.10),
	DIAMOND(.15),
	PLATINUM(.20);
	
	private double discount;
	
	MembershipLevel(double discount) {
		this.discount = discount;
	}
	
	public double getDiscount() {
		return discount;
	}

}
