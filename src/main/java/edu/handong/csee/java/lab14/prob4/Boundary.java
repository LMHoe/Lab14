package edu.handong.csee.java.lab14.prob4;//package

public class Boundary {//class Boundary
	
	private static int [] arr = new int[5];//new static integer array size of 5
	private static int count = 0;//new integer count
	
	public void receive(int num) throws ArrayIndexOutOfBoundsException{//throw exception
		
		int i = count;//set i as same value of count
		arr[i] = num;//put num at arr index of i
		count++;//increse value of count(+1)
		System.out.printf("arr[%d]<-%d\n",i,num);//print out information about array
	}

}
