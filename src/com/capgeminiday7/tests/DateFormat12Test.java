package com.capgeminiday7.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.day7.DateFormat12;

class DateFormat12Test {

	@Test
	void test() {
		//fail("Not yet implemented");
		assertEquals(true, DateFormat12.checkMagic(2,2,04));
		assertEquals(false, DateFormat12.checkMagic(9,8,18));
	}
	

}
