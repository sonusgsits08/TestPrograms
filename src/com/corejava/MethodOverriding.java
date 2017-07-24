package com.corejava;
class MethodOverridingParent {
	
	int add(int a, int b) {
		System.out.println("parent");
		return a + b;
	}
}

class MethodOverridngChild extends MethodOverridingParent {
	int add(int a, int b) {
		System.out.println("child");
		return a + b;
	}
}

public class MethodOverriding {
	public static void main(String[] args) {
		MethodOverridingParent parent;
		MethodOverridngChild mop = new MethodOverridngChild();
		parent = mop;
		System.out.println("" + parent.add(1, 3));

	}
}