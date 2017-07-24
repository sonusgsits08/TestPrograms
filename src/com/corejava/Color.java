package com.corejava;
public enum Color {
BLACK("black"),WHITE("white"),GREEN("green");
	String name;
	String value;
Color(String value){
	this.name = value;
}
public String getName() {
	return this.name;
}
public String getValue() {
	return this.value;
}
}
