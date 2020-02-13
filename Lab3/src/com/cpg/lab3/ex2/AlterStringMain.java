package com.cpg.lab3.ex2;

public class AlterStringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] name={"yogesh","souvik","anumay","vishal","sandip","sudip","ashok"};
		AlterString as=new AlterString();
		String [] newName=as.changeString(name);
		for(String localName:newName) {
			System.out.print(localName+" ");
		}
		

	}

}
