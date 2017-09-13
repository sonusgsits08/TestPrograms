package com.corejava;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CollectionSet {
public static void main(String[] args) {
	TestSet ts = new TestSet();
	Set<Employee> s = ts.getSet();
	System.out.println(s);
	
	Map<String,String> m = new HashMap<String,String>();
	m.put(null, "first");
	m.put(null, "second");
	m.put(null, "third");
	System.out.println("value is : "+m.get(null));
}
}

class TestSet{	
	Set<Employee> getSet() {	
//		Set<String> s = new HashSet<>();
//		s.add("1");
//		s.add("2");
//		s.add("1");
		Set<Employee> s = new HashSet<Employee>();
		Employee e1 = new Employee("siyaram", "A", 100);
		Employee e2 = new Employee("sunil", "B", 200);		
		Employee e3 = new Employee("siyaram", "A", 100);
		Employee e4 = new Employee("sunil", "B", 200);
		s.add(e1);
		s.add(e2);
		s.add(e3);
		s.add(e4);
		return s;
	}	
}