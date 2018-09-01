package com.day7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class VowelCount {
	static int count = 0;
	static int count1 = 0;

	public static int Vowels(File file) {

		try (FileReader filereader = new FileReader(file); BufferedReader br = new BufferedReader(filereader);) {
			String s;

			while ((s = br.readLine())!= null) {
				for (int i = 0; i < s.length(); i++) {
					char c = s.charAt(i);
					if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i'
							|| c == 'o' || c == 'u') {
						count = count + 1;
					}
					else {
						count1 = count1 + 1;
					}
				}
			}

		} 
			catch(IOException e) {

			e.printStackTrace();
		}
		return count;
	}
}