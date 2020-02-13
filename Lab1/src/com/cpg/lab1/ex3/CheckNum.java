package com.cpg.lab1.ex3;

public class CheckNum {
	public boolean checkNumber(int n) {
		int a=n%10;
        n=n/10;
        int ch=0;
        while(n>0){
            if(a>=n%10){
                a=n%10;
                n=n/10;
            }
            else{
                ch=1;
                break;
            }
        }
        if(ch==0){
            return true;
        }
        else{
            return false;
        }
	}

}
