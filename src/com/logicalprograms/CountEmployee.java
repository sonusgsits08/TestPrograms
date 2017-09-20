package com.logicalprograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.corejava.Employee;
public class CountEmployee {
public static void main(String[] args) {
HashMap<Department, List<Employee>> deptEmp = new HashMap<Department,List<Employee>>();
CountEmployee ce = new CountEmployee();
ce.prepareDepartment(deptEmp);

Department d1 = new Department();
d1.setdId("D");
d1.setdName("Finance1");
d1.setEcount(5);
//System.out.println("keys are:"+deptEmp.keySet());
List<Employee> emps = deptEmp.get(d1);
System.out.println(d1+" has "+emps.size()+" employees");
}

void prepareDepartment(Map<Department,List<Employee>> deptEmps){
	Department d1;
	for(int i=0;i<3;i++)
	{
		d1 = new Department();
		d1.setdId("D");
		d1.setdName("Finance"+i);
		d1.setEcount(5);
		List<Employee> emps=new ArrayList<>();
		Employee e;
		for(int j=0;j<5;j++){
		e=new Employee();
		e.seteId("E"+j+i);
		e.seteName("Employee"+j);
		e.seteSalary(100*j*i);
		emps.add(e);
		}
		deptEmps.put(d1, emps);
	}
}
}