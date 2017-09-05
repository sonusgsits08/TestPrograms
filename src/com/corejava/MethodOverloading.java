package com.corejava;

public class MethodOverloading {
public static void main(String[] args) {
//	System.out.println("1+2 is: "+add(1,2,3,4));
	add1(2);
}

// can we have only return type different & rest same : NO
//int add(int a,int b){
//	System.out.println("in int "+a+b);
//	return a+b;
//}
//String add(int a,int b){
//	return a+b;
//}	

static int add(int a,int ...b){
	return a+b[0];
}
static int add1(int a){
	System.out.println("this is int ");
	return 0;
}
static int add1(Integer a){
	System.out.println("this is Integer ");
	return 0;
}
}
