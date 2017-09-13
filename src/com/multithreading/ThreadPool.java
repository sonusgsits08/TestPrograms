package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkingThread implements Runnable {
	String threadName;
	WorkingThread(String threadName){
		this.threadName = threadName;
	}
	public void run() {		
		try {
			System.out.println("Thread name:"+Thread.currentThread().getName()+"--Start--");
			Thread.sleep(10000);
			System.out.println("Thread name:"+Thread.currentThread().getName()+"--End--");
		} catch (InterruptedException e) {		
			e.printStackTrace();
		}
	}
}
public class ThreadPool {
 public static void main(String[] args) {	
	 ExecutorService es = Executors.newFixedThreadPool(5);
	 //ExecutorService es = Executors.newSingleThreadExecutor(); this executes thread in sequence
	 for(int i=0;i<=5;i++){
		 Runnable wt = new WorkingThread(" "+i);
		 es.execute(wt);
	 }
	 es.shutdown();
	 while (!es.isTerminated()) {		 
	}
	 System.out.println("All Threads finished");
}
}