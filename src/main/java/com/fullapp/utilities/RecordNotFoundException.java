package com.fullapp.utilities;

public class RecordNotFoundException extends Exception{
	private static final long serialVersionUID = -498883457729663534L;

	public String getMessage() {
		return "Record Not Found with that ID";
	}

}
