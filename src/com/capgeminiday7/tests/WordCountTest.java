package com.capgeminiday7.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.day7.WordCount;

class WordCountTest {

	@Test
	void testWordCount() {
		assertEquals(50, WordCount.countNumberOfWords("camera"));

	
	}

}
