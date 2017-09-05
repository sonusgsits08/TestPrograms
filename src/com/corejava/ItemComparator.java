package com.corejava;

import java.util.Comparator;

public class ItemComparator implements Comparator<Item>{	
	@Override
	public int compare(Item o1, Item o2) {
		if(o1.itemId < o2.itemId){
			return -1;
		}
		if(o1.itemId > o2.itemId){
			return 1;
		}
		else{
			return o1.itemName.compareToIgnoreCase(o2.itemName);
		}		
	}
}