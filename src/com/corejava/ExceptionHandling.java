package com.corejava;

import java.util.ArrayList;
import java.util.List;

public class ExceptionHandling {
   public static void main(String[] args) throws ValidationException {	   
	   
	   ArithmeticExcExample ex = new ArithmeticExcExample();
	try{
		ex.divide(2,3);		
	}
	catch(ArithmeticException ae){
		List<ValidationErrorField> errs = new ArrayList<>();
		ValidationErrorField validationErrorField = new ValidationErrorField("One");		
		ValidationErrorField validationErrorField2 = new ValidationErrorField("Two");
		errs.add(validationErrorField);
		errs.add(validationErrorField2);		
		throw new ValidationException(errs);
		//System.out.println("arithmetic exception is:"+ae);
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