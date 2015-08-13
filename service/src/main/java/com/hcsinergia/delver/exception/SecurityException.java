package com.hcsinergia.delver.exception;

public class SecurityException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4328973086321330012L;

	public SecurityException(String message, Throwable cause) {
		super(message, cause);
	}

	public SecurityException(String message) {
		super(message);
	}

	public SecurityException(Throwable cause) {
		super(cause);		
	}
	
	
}
