package com.cpg.lab8.ex1;

import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.io.IOException;

import java.io.FileOutputStream;

public class CopyDataThread extends Thread{
	Thread t;
	CopyDataThread(){
		super("copyData");
		start();
	}
	
	public void run() {
		System.out.println(Thread.currentThread());
		System.out.println("Hello");
		String myfile="file1";
		String myfile1="file2";
		try {
			FileInputStream fis=new FileInputStream("D:\\"+ myfile+".txt");
			FileOutputStream fos=new FileOutputStream("D:\\"+ myfile1+".txt");
			int count=0;
			int i;
			while((i=fis.read())!=-1) {
				if(count<10) {
					fos.write((char)i);
					//System.out.print((char)i);
				}
				else {
					System.out.println("10 characters copied");
					try{
						Thread.sleep(500);
					}
					catch(InterruptedException ee) {
						System.out.println(ee);
					}
					fos.write((char)i);
					count=0;
				}
				count++;
			}
		
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found");
		}
		catch(IOException e) {
			System.out.println("File not found");
		}
		
		
	}
}
