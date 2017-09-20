package com.logicalprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FetchCallCount {
public static void main(String[] args) {
	FetchCallCount fcc = new FetchCallCount();
	Map<Integer,UserDetailsDto> userCalls = new HashMap<Integer,UserDetailsDto>();
	UserDetailsDto udd = new UserDetailsDto();
	udd.setMobileNo("123");
	udd.setDay("sunday");
	udd.setCallDuration("10");
	userCalls.put(1, udd);
	
	UserDetailsDto udd1 = new UserDetailsDto();
	udd1.setMobileNo("123");
	udd1.setDay("sunday");
	udd1.setCallDuration("5");	
	userCalls.put(2, udd1);
	
	UserDetailsDto udd2 = new UserDetailsDto();
	udd2.setMobileNo("124");
	udd2.setDay("monday");
	udd2.setCallDuration("1");
	userCalls.put(3, udd2);	
	int i = fcc.getCallsMade("123", "sunday", userCalls);
	System.out.println("calls made"+i);
}
int getCallsMade(String mobile,String day,Map<Integer,UserDetailsDto> userCalls){
	Set<Integer> keys = userCalls.keySet();
	int count=0;
	for (Integer key : keys) {
		UserDetailsDto userDetailsDto = userCalls.get(key);
			if(userDetailsDto.getMobileNo().equalsIgnoreCase(mobile) && userDetailsDto.getDay().equalsIgnoreCase(day)){
				count++;
			}
	}
	return count;
}
}