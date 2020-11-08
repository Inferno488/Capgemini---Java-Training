package com;

@SuppressWarnings("serial")
public class BlankNameException extends Exception {
	private String msg;
	/**
	 * 
	 */
	BlankNameException(String msg) {
		this.msg = msg;
	}
	

	public String toString() {
		return msg;
	}

}
