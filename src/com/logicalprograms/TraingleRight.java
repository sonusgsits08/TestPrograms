package com.logicalprograms;

public class TraingleRight {
public static void main(String[] args) {
	char [] wheat = {'w','h','e','a','t'};
	int index=0;
	while(index < wheat.length){
		for (char c : wheat) {
			System.out.print(c);
		}
		System.out.println();
		wheat[index++]=' ';
	}
}
}