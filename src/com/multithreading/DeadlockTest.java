package com.multithreading;

class Deadlock implements Runnable{
    String name = "siyaram";
    String surname;
    public Deadlock(String surname) {
		this.surname=surname;
	}
	@Override
	public void run() {
		synchronized (surname) {
			synchronized (name) {
				System.out.println(Thread.currentThread().getName()+" name:"+name+" surname:"+surname);	
			}				
		}		
	}
}
public class DeadlockTest
{
	public static void main(String[] args) {		
		Deadlock d1 = new Deadlock("vishwakarma");
		Deadlock d2 = new Deadlock("kumar");
		Thread t1 = new Thread(d1);
		Thread t2 = new Thread(d2);
		t1.start();
		t2.start();
	}
}