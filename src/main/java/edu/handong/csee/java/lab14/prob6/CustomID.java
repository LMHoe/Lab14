package edu.handong.csee.java.lab14.prob6;//package

public class CustomID extends Exception{//class CustonID extends Exception

	private String[] races = new String[] {"Vulcans", "Romulan", "Klingons"};//new string array races
	private String name = "";//new string name
	private int age = 0;//new integer age
	private String race="";//new string race
	private int state = 0;//new integer state
	
	public void set_name(String str) throws Exception{//set_name throws Exception
		if(str.length()<5) {//if str length is less than 5, do under process
			state=0;//set state as 0
			throw new Exception("Your name is short! try again!");//throw new Exception
		}
		else {//if str lengh is larger than 5, do under process
			this.name=str;//set name as str
			System.out.println("Name is valid");//print out information
			System.out.println("Name: "+this.name);//print out user name
			state++;//increase state(increase 1)
		}
	}
	
	public void set_age(int num) throws Exception{//set_age throws Exception
		if(num<18) {//if num is under 18, do under process
			state = 1;//set state as 1
			throw new Exception("You are too young! Try again");//throw new Exception
		}
		else {//if num is over 18, do under process
			this.age = num;//set age as num
			System.out.println("Age is valid");//print out information
			System.out.println("Age: "+this.age);//print out user age
			state++;//increase state(increase 1)
		}
	}
	
	public void set_race(String race) throws Exception{//set_race throws Exception
		for(int i =0; i<races.length; i++) {//do under process for races' length times
			if(races[i].equals(race)) {//if races' i_th index is equals to race, do under process
				this.race = races[i];//set race as races' i_th index value
				System.out.println("Race is valid");//print out information
				System.out.println("Race: "+races[i]);//print out users race
				state=0;//set state as 0
				return;//return
			}
		}
		state = 2;//if race is not equals to races members
		throw new Exception("Human! try again");//throw new Exception
	}
	
	public int getState() {//getState
		
		return state;//return state
	}
}
