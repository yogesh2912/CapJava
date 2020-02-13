package com.cpg.lab1.ex4;

public class CheckNum {
	public boolean checkNumber(int num) {
		boolean flag=  num!=0 && ((num&(num-1))==0);
		return flag;
	}

}
