package edu.handong.csee.java.lab14.prob3;//package

public class Powercalc {//class Powercalc
	
	public long power(int n, int p)throws Exception{//throw exception
		
		long result = 0;//new long result
		
		result = (long)Math.pow(n,p);//do math.pow with n and p(do power calculation)
		if(n<0||p<0) {//if n or p is negative
			
			throw new Exception("n or p should not be negative");//throw exception
		}
		if(n==0&&p==0) {//if n and p are both zero
			
			throw new Exception("n and p shold not be zero");//throw exception
		}
		return result;//retrun result
	}

}
