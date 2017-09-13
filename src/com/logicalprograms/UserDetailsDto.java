package com.logicalprograms;

import lombok.Data;

public class UserDetailsDto {
private String mobileNo;
private String callDuration;
private String day;
public String getMobileNo() {
	return mobileNo;
}
public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
}
public String getCallDuration() {
	return callDuration;
}
public void setCallDuration(String callDuration) {
	this.callDuration = callDuration;
}
public String getDay() {
	return day;
}
public void setDay(String day) {
	this.day = day;
}

}
