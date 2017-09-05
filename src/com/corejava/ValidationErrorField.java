package com.corejava;
import java.io.Serializable;

public class ValidationErrorField implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String errMsg;
	
	public ValidationErrorField(String errMsg){
		this.errMsg = errMsg;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	@Override
	public String toString() {
		return "ValidationErrorField [errMsg=" + errMsg + "]";
	}
	

}
