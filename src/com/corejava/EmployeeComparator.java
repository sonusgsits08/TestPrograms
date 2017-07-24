package com.corejava;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {		
		if(o1.eName.equals(o2.eName)){
			return 0;
		}
		else {
			return o1.eName.compareToIgnoreCase(o2.eName);
		}		
	}

}
