package com.fullapp.utilities;

public class RecordAlreadyExistsException extends Exception {
   
	/**
	 * 
	 */
	private static final long serialVersionUID = -4988834577296635021L;

	public String getMessage() {
		return "Record Already Exists with that ID";
	}
}
