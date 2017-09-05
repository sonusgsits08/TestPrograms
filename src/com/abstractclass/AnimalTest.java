package com.abstractclass;
abstract class Animal{
	abstract void walk();
	void eat(){
		System.out.println("animal is eating");
	}	
}
class Dog extends Animal{

	@Override
	void walk() {
	System.out.println("Dog is walking");		
	}
	/*overriding eat() method , changing default implementation*/
	void eat(){
		System.out.println("Dog is eating");
	}	
}
public class AnimalTest{
	public static void main(String[] args) {
		Animal an = new Dog();
		an.eat();
		an.walk();
	}
}