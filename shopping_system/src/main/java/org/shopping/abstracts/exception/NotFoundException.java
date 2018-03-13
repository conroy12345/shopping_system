package org.shopping.abstracts.exception;

public class NotFoundException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String code;
	private String message;
	
	
	public NotFoundException(String code, String message) {
		super();
		this.code = code;
		this.message = message;
	}
	
	
	public NotFoundException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}


	public NotFoundException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
