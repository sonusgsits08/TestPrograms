package com.corejava;

import java.io.Serializable;
import java.util.List;

//@ToString
public class ValidationException extends Exception implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	List<ValidationErrorField> errMsgs;
	public ValidationException(List<ValidationErrorField> errMsgs) {
		super("there is validation exception");
		this.errMsgs = errMsgs;
	}
}
