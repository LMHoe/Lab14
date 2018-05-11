package edu.handong.csee.java.lab14.prob5;//package

public class MyException extends Exception {//class MyException extends Exception
	
	private String message = null;//new String message with null string
	
	public MyException() {//MyException
		super();//super
	}
	
	public MyException(String message) {//MyException with string message
		super(message);//super message
		this.message = message;//set message as message
	}
	
	public MyException(Throwable cause) {//MyException with Throwable cause
		super(cause);//super cause
	}
	
	public String toString() {//toString
		return message;//return message
	}
	

}
