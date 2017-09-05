package com.corejava;

import java.util.TreeSet;

public class TreeSetWithCustomObject {
	public static void main(String[] args) {
		TreeSet<Address> add = new  TreeSet<>();
		Address ad1 = new Address("12 lane 1", "P", 3);	
		Address ad2 = new Address("12 lane 2", "A", 1);	
		Address ad3 = new Address("12 lane 1", "pune", 5);
		add.add(ad1);
		add.add(ad2);
		add.add(ad3);
		
		System.out.println("Treeset is"+add);
	}
}