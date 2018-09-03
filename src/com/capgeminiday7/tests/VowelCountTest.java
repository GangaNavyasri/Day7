package com.capgeminiday7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

import com.day7.VowelCount;

class VowelCountTest {

	@Test
	void test() {
		
				File file=new File("C:\\navya\\String.txt");
				assertEquals(9,VowelCount.Vowels(file));
			}
	
	}

