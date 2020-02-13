package com.cpg.lab1.ex1;

public class CalculateSum {
	public int calculateSum(int n) {
		int i=1;
        int co=0;
        int sum=0;
        while(co<n){
            if(i%5==0 || i%3==0){
                co++;
                sum=sum+i;
            }
            i++;
        }
        return sum;
	}

}
