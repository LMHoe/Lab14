package edu.handong.csee.java.lab14.prob5;//package

import java.util.Scanner;//import Scanner

public class Prob5_main {//class Prob5_main

	static void myTest(String str) throws MyException{//throw myException
		
		if(str.equals("null")) {// if str is null string, do under process
			throw new MyException("String val is null");//throw new myException
		}
		else//if str is not null string, do under process
			System.out.println("String val is: "+str);//print out str
	}

	
	public static void main(String[] args) {//this is main class
		
		try {//try-catch statement
			Scanner key = new Scanner(System.in);//new Scanner key
			String str = key.nextLine();//set str as given string
			Prob5_main.myTest(str);//do myTest
		}catch(MyException e) {//catch exception
			System.out.println("Inside catch block: "+e);//print out information about exception
		}

	}
	

}
