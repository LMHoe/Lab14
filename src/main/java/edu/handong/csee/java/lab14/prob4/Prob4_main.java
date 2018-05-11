package edu.handong.csee.java.lab14.prob4;//package

import java.util.Scanner;//import Scanner

public class Prob4_main {//class Prob4_main

	public static void main(String[] args) {//this is main class
		
		Scanner in = new Scanner(System.in);//new Scanner in
		int num = 0;//new int num
		
		Boundary array = new Boundary();//new Boundary array
		boolean re = true;//new boolean re
		
		while(re) {//do under process while re is true
			try {//try-catch statement
				System.out.print("Enter an integer: ");//ask user to enter an integer
				num = in.nextInt();//set num as given integer 
				array.receive(num);//put num at array
			}catch(ArrayIndexOutOfBoundsException e) {//catch ArrayIndexOutOfBoundsException e
				System.out.println("Invalid array index access");//print out information about array
				re = false;//make re as false
			}
		}

	}

}
