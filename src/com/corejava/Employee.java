package com.corejava;

public class Employee {
String eName;
String eId;
public Employee(){	
}
public String geteName() {
	return eName;
}
public void seteName(String eName) {
	this.eName = eName;
}
public String geteId() {
	return eId;
}
public void seteId(String eId) {
	this.eId = eId;
}
public int geteSalary() {
	return eSalary;
}
public void seteSalary(int eSalary) {
	this.eSalary = eSalary;
}
int eSalary;


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((eId == null) ? 0 : eId.hashCode());
	result = prime * result + ((eName == null) ? 0 : eName.hashCode());
	result = prime * result + eSalary;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	if (eId == null) {
		if (other.eId != null)
			return false;
	} else if (!eId.equals(other.eId))
		return false;
	if (eName == null) {
		if (other.eName != null)
			return false;
	} else if (!eName.equals(other.eName))
		return false;
	if (eSalary != other.eSalary)
		return false;
	return true;
}

@Override
public String toString() {
	return "Employee [eName=" + eName + ", eId=" + eId + ", eSalary=" + eSalary + "]";
}
public Employee(String ename,String eid,int esalary) {
	this.eName = ename;
	this.eId=eid;
	this.eSalary=esalary;			
}

}
