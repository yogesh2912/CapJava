package com.cpg.lab6.ex6;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class DisplayInfo {
	void showInfo(String myfile) {
		int index=0;
		BufferedReader br;
		try{
				System.out.println(myfile);
				br= new BufferedReader( new FileReader("D:\\"+ myfile+".txt")); 
				
				FileInputStream frs=new FileInputStream("D:\\"+ myfile+".txt");

	       
				String ch="";
				StringBuilder sb=new StringBuilder();
				
				int dd;
				int newCo=0;
				
				System.out.println("DDDDDEEEEKHO");
				
				while((dd=frs.read())!=-1) {
					if((char)dd!=' ') {
						//System.out.print((char)dd);
						newCo++;
					}
					else {
						
					}
				}
				
	        
	        
				while((ch=br.readLine())!=null) {
					//System.out.println(index+". "+ch); 
					sb.append(" "+ch);
					index++;
				}
				int count=0;
	          
				System.out.println("jehd "+sb);
				StringTokenizer ss=new StringTokenizer(sb.toString()," ");
				while(ss.hasMoreTokens()){
					ss.nextToken();
					count++;
				}
	        
				System.out.println("Number of words "+count);
				System.out.println("Number of Lines "+index);
				System.out.println("Number of Characters "+newCo);
	        
	       //fin.close();
	        }
	        catch(IOException e){
	            System.out.println("Nahi hoga be" +e);
	        }
	}

}
