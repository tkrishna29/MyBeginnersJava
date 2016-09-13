package com.java.beginner;

public class UsingEnum {
	 
	public enum Company {
		EBAY, PAYPAL, GOOGLE, YAHOO, ATT
	}
 
	Company cName;
 
	public UsingEnum(Company cName) {
		this.cName = cName;
	}
 
	public void companyDetails() {
		switch (cName) {
		case EBAY:
			System.out.println("Biggest Market Place in the World.");
			break;
 
		case PAYPAL:
			System.out.println("Simplest way to manage Money.");
			break;
 
		case GOOGLE:
		case YAHOO:
			System.out.println("1st Web 2.0 Company.");
			break;
 
		default:
			System.out.println("Google - biggest search giant.. ATT - my carrier provider..");
			break;
		}
	}
 
	public static void main(String[] args) {
		UsingEnum ebay = new UsingEnum(Company.GOOGLE);
		ebay.companyDetails();
		UsingEnum paypal = new UsingEnum(Company.PAYPAL);
		paypal.companyDetails();
		UsingEnum google = new UsingEnum(Company.GOOGLE);
		google.companyDetails();
		UsingEnum yahoo = new UsingEnum(Company.YAHOO);
		yahoo.companyDetails();
		UsingEnum att = new UsingEnum(Company.ATT);
		att.companyDetails();
Boolean b1 = true, b2 = false;
 int x = b2.compareTo(b1);
 System.out.println(x);


	}
}