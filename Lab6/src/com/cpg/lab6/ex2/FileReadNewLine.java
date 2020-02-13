package com.cpg.lab6.ex2;

import java.io.BufferedReader;

import java.io.FileReader;

import java.io.IOException;
import java.util.StringTokenizer;

public class FileReadNewLine {
	public void readFileNewLine(String myfile) {
		int index=1;
		BufferedReader br;
		try{
				System.out.println(myfile);
				br= new BufferedReader( new FileReader("D:\\"+ myfile+".txt")); 
				

	       
				String ch="";
				//StringBuilder sb=new StringBuilder();
	        
	        
				while((ch=br.readLine())!=null) {
					System.out.println(index+". "+ch); 
					//sb.append(" "+ch);
					index++;
				}
				/*int count=0;
	          
				System.out.println("jehd "+sb);
				StringTokenizer ss=new StringTokenizer(sb.toString()," ");
				while(ss.hasMoreTokens()){
					ss.nextToken();
					count++;
				}
	        
				System.out.println("Number of words "+count);*/
	        
	       //fin.close();
	        }
	        catch(IOException e){
	            System.out.println("Nahi hoga be" +e);
	        }
	}

}
