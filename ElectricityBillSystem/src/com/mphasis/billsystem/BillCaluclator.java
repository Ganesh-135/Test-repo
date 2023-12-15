package com.mphasis.billsystem;

public class BillCaluclator {

	public static void main(String[] args) {
		int units =280;
		double billToPay = 0;
		if(units < 100)
		{
			billToPay = units * 1.20;
		}
		else if(units < 300)
		{
			billToPay = 10 * 1.20 + (units - 100)*2;
		}
		System.out.println("the electricity bill for " + units + "is : " + billToPay);

	}

}
