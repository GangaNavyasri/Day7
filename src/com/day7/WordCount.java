package com.day7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {

	private static int wordcount;

	public static int countNumberOfWords(String string) {
		File file=new File("C:\\navya\\capgemini.txt");
		int count=0;
		try(BufferedReader reader = new BufferedReader(new FileReader (string))) {
			
			String s;
			while ((s = reader.readLine()) != null) {
				int ct=1;
				for(int i = 0; i < s.length();i++)
				{
					if(s.charAt(i)==' ')
					{
						ct++;
					}
				}
				count = count + ct;
			}
			return count;
		} catch (IOException e) {
			e.printStackTrace();
		}

		return count;
	}
	
}
