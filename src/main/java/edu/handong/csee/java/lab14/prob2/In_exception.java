package edu.handong.csee.java.lab14.prob2;//package

import java.util.*;//import every utilization

public class In_exception {//class In_exception
	
	private int x=0, y=0;//new private integers
	
	public In_exception() {}//public In_exception
	
	public void error_det() {//error_det
		
		try {//try-catch statment
			Scanner keyboard = new Scanner(System.in);//new Scanner keyboard
			System.out.print("x: ");//ask user to type x
			x=keyboard.nextInt();//get x from user
			System.out.print("y: ");//ask user to type y
			y=keyboard.nextInt();//get y from user
			System.out.println(this.x/this.y);//if there is no error, print out x divided by y
		}
		catch(ArithmeticException e) {//catch arithmetic exception e
			System.out.println("java.Lang.ArithmeticException: "+e.getMessage());//print out information about error
		}
		catch(InputMismatchException e) {//catch inputmimatch exception e
			System.out.println("java.util.InputMismatchException");//print out information about error
		}
		catch(Exception e) {//catch exception e
			System.out.println("Some other exception has occurred: "+e.getMessage());//print out information about error
		}
	}
}
