package com.corejava;

public class TestImmutableEmployee {
public static void main(String[] args) {
	Address address = new Address("12 jail road", "Pune", 1234);
	Address address2 = new Address("12 jail road1", "Pune1", 1235);
	ImmutableEmployee ie1 = new ImmutableEmployee("siyaram1", 29, 1000, address);
	System.out.println("before change: "+ie1);
	ImmutableEmployee ie2 = new ImmutableEmployee("siyaram2", 29, 1000, address2);
	ie1=ie2;
	System.out.println("after change: "+ie1);
	
	String str = new String("old string");
	System.out.println("before change string is: "+str);
	String str3 = new String("newest string");
	str=str3;
	//String str2 ="hello";
	//str2 =str;	
	str.replaceAll("old", "new");
	System.out.println("changed string is: "+str);
	//System.out.println("str2 is: "+str2);	
}
}
