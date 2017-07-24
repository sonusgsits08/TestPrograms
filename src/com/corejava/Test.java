package com.corejava;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;


public class Test {
	public static void main(String[] args) {
		
		TreeSet t = new TreeSet();		
		System.out.println(t);		
		Person p1 = new Person("siyaram","vishwakarma");
		Person p2 = new Person("siyaram","vishwakarma");
		Hashtable st = new Hashtable();
		Map m = new HashMap();
		if(p1.equals(p2))
		{
			System.out.println("equal");
		}
		else{
			System.out.println("un-equal");
		}
		
		Employee e1 = new Employee("siyaram", "S", 100);
		Employee e2 = new Employee("rajesh", "R", 200);
		Employee e3 = new Employee("shivani", "S", 300);
		List<Employee> li = new ArrayList<Employee>();
		li.add(e1);
		li.add(e2);
		li.add(e3);
		Collections.sort(li, new EmployeeComparator());
		for (Employee employee : li) {
			System.out.println("sorted employee list"+employee);	
		}
		
		
	}
}
class Person{
	String fname;
	String lname;
	public Person(String fname,String lname) {
	this.fname=fname;
	this.lname=lname;
	}
	public String toString() {
	return 	fname+" "+lname;
	}
	@Override
	protected void finalize() throws Throwable {
		
		super.finalize();
	}
}