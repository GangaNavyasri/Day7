package com.capgeminiday7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.day7.MyDate;

class DateTest {

		
		@Test
		void testMyDate() {
			
	          MyDate date1=new MyDate(LocalDate.of(2018, 9, 8));
	          MyDate date2=new MyDate(LocalDate.of(2018, 06, 29));
	          MyDate date3=new MyDate(LocalDate.of(2016, 02, 20));
	          
	          ArrayList<MyDate> al=new ArrayList<>();
	          al.add(date1);
	          al.add(date2);
	          al.add(date3);
	          
	          ArrayList<MyDate> result=new ArrayList<>();
	          
	          try(FileOutputStream fileOutput=new FileOutputStream("c:\\navya\\String.txt");
	        		 ObjectOutputStream objectOutput=new ObjectOutputStream(fileOutput))
	        		  {
	        	  objectOutput.writeObject(al);
	        	  
	          }
	          catch(IOException e)
	          {
	        	  e.printStackTrace();
	          }
	          
	          try(FileInputStream fileInput=new FileInputStream("c:\\navya\\String.txt");
	         		 ObjectInputStream objectInput=new ObjectInputStream(fileInput))
	         		  {
	         	   result=(ArrayList<MyDate>)objectInput.readObject();
	           }
	           catch(IOException e)
	           {
	         	  e.printStackTrace();
	           } catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
	          System.out.println(result);
		}
		

}
