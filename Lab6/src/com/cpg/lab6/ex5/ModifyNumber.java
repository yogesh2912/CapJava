package com.cpg.lab6.ex5;

public class ModifyNumber {
	
	int modifyNumber(int num) {
		//String str=Integer.toString(num);
		String str=String.valueOf(num);    //dono me koi bhi use kr sakte ho re baba.
		
		if(str.length()==1) {
			//System.out.println(str);
			return Integer.valueOf(str);
			
		}
		else {
			int strLen=str.length();
			StringBuilder sb=new StringBuilder();
			for(int index=1;index<strLen;index++) {
				int re=Math.abs(str.charAt(index)-str.charAt(index-1));
				sb.append(re);
				//System.out.println(re);
			}
			sb.append(str.charAt(strLen-1));
			String result=sb.toString();
			
			return Integer.valueOf(result);
		}
		
	}

}
