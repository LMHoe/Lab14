package edu.handong.csee.java.lab14.prob1;//package

public class SpeedLimitter {//class SpeedLimitter
	
	private int speed = 0;//private integer speed set as 0
	private int limit = 0;//private integer limit set as 0
	
	public SpeedLimitter(int limit, int speed) {//get limit and speed value
		
		this.speed = speed;//set speed as speed value
		this.limit = limit;//set limit as limit value
	}
	
	public void warnSpeedLimit() {//warn whether speed is over the limit
		
		try {//try-catch statement
			if(this.speed > this.limit) {//do under process if speed is larger than limit
				throw new Exception("Speed Limit "+this.limit+"km exceeded!");//throw new exception
			}
			System.out.println("You are a Low abiding citizen!");//print out if speed is lower than limit
			}catch(Exception e) {//do under process if exception e
				System.out.println(e.getMessage());//print out exception e's message
				System.out.println("You are being fined.");//print out message
		}
		System.out.println("Your current speed: "+this.speed);//print out current speed
	}

}
