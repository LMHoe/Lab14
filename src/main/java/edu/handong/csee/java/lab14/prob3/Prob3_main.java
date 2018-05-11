package edu.handong.csee.java.lab14.prob3;//package

import java.util.Scanner;//import Scanner

public class Prob3_main {//class Prob3_main

	public static final Powercalc my_cal = new Powercalc();//new Powercalc my_cal
	public static final Scanner in = new Scanner(System.in);//new Scanner in

	public static void main(String[] args) {//this is main class
		
		while(in.hasNextInt()) {//do under process while has next int
			int n = in.nextInt();//set n as input integer
			int p = in.nextInt();//set p as input integer
			
			try {//try-catch statement
				System.out.println(my_cal.power(n, p));//do my cal_cal.power 
			}catch(Exception e) {//catch exception
				System.out.println(e);//print out about exception
			}
		}
		

	}

}
