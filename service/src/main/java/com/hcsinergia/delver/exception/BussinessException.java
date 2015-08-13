package com.hcsinergia.delver.exception;

public class BussinessException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6237997015695985678L;

	public BussinessException(String message, Throwable cause) {
		super(message, cause);
	}

	public BussinessException(String message) {
		super(message);
	}

	public BussinessException(Throwable cause) {
		super(cause);
	}

}
