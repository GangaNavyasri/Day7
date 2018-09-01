package com.capgeminiday7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

import com.day7.Grep;

class GrepTest {

	@Test
	void testGrep() {
		File file=new File("c:\\navya\\String.txt");
		assertEquals(true,Grep.stringSearch(file,"Handling"));
		
		
		//fail("Not yet implemented");
	}

}
