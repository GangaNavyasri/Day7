package com.day7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Line {
	
	public static int LineCount() {
		// TODO Auto-generated constructor stub
		
			File file=new File("C:\\navya\\capgemini.txt");
			int count=0;
			
			try(FileReader readfile=new FileReader(file);
					BufferedReader reader = new BufferedReader(readfile))
			{
			
			while (reader.readLine() != null)
			{
				
				count++;
			}
			System.out.println(count);
			return count;
			}
			
			catch (Exception e)
			{
				e.printStackTrace();
			}
			return count;
			
	


	}

	
	

}
