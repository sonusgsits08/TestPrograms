package com.corejava;
import java.util.ArrayList;
import java.util.List;

//@FunctionalInterface
interface Add{
	int add(int a,int b);
}

public class LambdaExpression {
	public static void main(String[] args) {			
Add ad1 = (int a,int b)->{
		int x=a;
		int y=b;
		return x+y;
		};
		
		int sum = ad1.add(2, 3);
		System.out.println("lambda expression: addition result of 2,3 is:"+sum);
		
		//Lambda expression for List 
		List<String> names = new ArrayList<>();
		names.add("siyaram");
		names.add("rajesh");

		names.forEach(
				(n) ->
				{
					System.out.println("name is: "+n);			
		});		
	}		
}