package com.corejava;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*this program finds all employees who are also manager
 * so in below program it will return sonu , shivani,seema */
public class MNGEMPHashMap {
	public static void main(String[] args) {		
		Map<String,String> hm = new HashMap<>();
		hm.put("siyaram", "sonu");
		hm.put("sonu", "shivani");
		hm.put("ram", "shyam");
		hm.put("shivani", "seema");
		hm.put("mohan", "monu");
		hm.put("seema", "reema");
		System.out.println("All managers :"+getAllManager(hm));
	}
	static Set<String> getAllManager(Map<String,String>MGMEMP){
		Set<String> managers = MGMEMP.keySet();
		Set<String> managersResult = new HashSet<String>();
		for (String mgr : managers) {
			String emp = MGMEMP.get(mgr);
			if(managers.contains(emp)){
				managersResult.add(emp);				
			}
		}		
		return managersResult;
	}

}
