package edu.handong.csee.java.lab14.prob1;//package

import java.util.Scanner;//Scanner import
import java.util.Random;//Random import

public class Prob1_main {//class Prob1_main

	public static void main(String[] args) {//this is main class
		
		Scanner keyboard = new Scanner(System.in);//new Scanner as keyboard
		Random rand = new Random();//new Random as rand 
		int limit =0, speed = 0;//new int limit and speed set initialy as 0
		
		System.out.print("Set the speed limit, officer: ");//ask user to type integer number
		limit = keyboard.nextInt();//get input number at limit
		speed = rand.nextInt(101);//set random number at speed
		
		SpeedLimitter lim=new SpeedLimitter(limit, speed);//new SpeedLimmitter as lim with given value of limit and speed
		
		lim.warnSpeedLimit();//find out if speed is exceeded limit
		
		keyboard.close();//close keyboard

	}

}
