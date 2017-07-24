package com.corejava;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CollectionHashMap {
public static void main(String[] args) {

	Map<String,String> m = new HashMap<>();
	m.put("first","siyaram");
	m.put("second","sonu");
	m.put("second","sonu2");
	m.put("second","sonu3");
	
	   Iterator itr = m.entrySet().iterator();
	   while(itr.hasNext()){
		   Map.Entry<String, String> entry = (Map.Entry<String, String>)itr.next();
		   String key = entry.getKey();
		   String value = entry.getValue();
		   System.out.println("key is:"+key+" & value is:"+value);		   
	   }
}
}
