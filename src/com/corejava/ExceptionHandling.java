package com.corejava;
public class ExceptionHandling {
   public static void main(String[] args) {
	   ArithmeticExcExample ex = new ArithmeticExcExample();
	try{
		ex.divide(2,3);		
	}
	catch(ArithmeticException ae){
		System.out.println("arithmetic exception is:"+ae);
	}
	catch(ArrayIndexOutOfBoundsException aiobe){
		System.out.println("Array Index out of Bound:"+aiobe);
	}
   }
}
class ArithmeticExcExample{
	public float divide(int a,int b){
		return a/0;
	}
    public void printa(int a[]){
    	System.out.println("array contents are"+a[2]);
    }
}