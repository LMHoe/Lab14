package edu.handong.csee.java.lab14.prob6;//package

import java.util.Scanner;//import Scanner

public class Prob6_main {//class Prob6_main

	public static void main(String[] args) {//this is class main
		
		String name, race;//new string race
		int age=0;//new integer age
		Scanner key = new Scanner(System.in);//new Scanner as key
		CustomID id = new CustomID();//new CustomID as id
		boolean re=true;//new boolean re set as true
		
		while(re) {//do under process while re is true
 			try {//try catch statement
				if(id.getState()==0) {//if id's state is 0, do under process
					System.out.print("Enter your name: ");//ask user name
					name = key.nextLine();//get name
					id.set_name(name);//do id.set_name
				}
				else if(id.getState()==1) {//if id's state is 11, do under process
					System.out.print("Enter your age: ");//ask user age
					age = key.nextInt();//get age
					id.set_age(age);//do id.set_age
				}
				else {//if state is not 0 and 1, do this process
				System.out.print("Enter your race: ");//ask user race
				race = key.nextLine();//get race
				id.set_race(race);//do id.set_race
				}
			}catch(Exception e) {//catch exception
				System.out.println(e.getMessage());//print out message
				continue;//continue
			}
		}

	}

}
