package com.corejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class TestItem {
public static void main(String[] args) {
	Item i1 = new Item();
	i1.setItemId(2);
	i1.setItemName("item1");
	Item i2 = new Item();
	i2.setItemId(2);
	i2.setItemName("item2");
	Item i3 = new Item();
	i3.setItemId(3);
	i3.setItemName("item3");
	List<Item> items = new ArrayList<Item>();
	items.add(i1);items.add(i2);items.add(i3);
	System.out.println("items before sort"+items);
	Collections.sort(items, new ItemComparator());
	System.out.println("items after sort"+items);
	
	
	TreeSet<Item> items2 = new TreeSet<>();
	items2.add(i1);
	items2.add(i2);
	items2.add(i3);
	
	System.out.println("items2 before sort"+items2);
	//Collections.sort(items, new ItemComparator());
	//System.out.println("items after sort"+items);
	
	
	
}
}
