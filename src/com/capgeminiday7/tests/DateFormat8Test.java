package com.capgeminiday7.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.day7.WeekDay;

class DateFormat8Test {

	@Test
		
		void testWeekDay() {
			
			assertEquals("Saturday,September 08,2018",WeekDay.displayWeekDay());
			 
		}

	}


