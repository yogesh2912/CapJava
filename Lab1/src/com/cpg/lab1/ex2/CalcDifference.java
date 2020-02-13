package com.cpg.lab1.ex2;

public class CalcDifference {
	public int calculateDifference(int n) {
		int first=0;
        int second=0;
        for(int i=1;i<=n;i++){
            first=first+(i*i);
            second=second+i;
        }
        int Sum=first-(second*second);
        return Sum;
	}

}
