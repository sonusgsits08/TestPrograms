package com.corejava;
import java.util.HashSet;
import java.util.Set;

public class CollectionSet {
public static void main(String[] args) {
	TestSet ts = new TestSet();
	Set<String> s = ts.getSet();
	System.out.println(s);
}
}

class TestSet{	
	Set<String> getSet() {	
		Set<String> s = new HashSet<>();
		s.add("1");
		s.add("2");
		s.add("1");
		return s;
	}	
}