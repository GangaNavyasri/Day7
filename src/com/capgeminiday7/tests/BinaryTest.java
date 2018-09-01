package com.capgeminiday7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

import com.day7.BinaryInteger;

class BinaryTest {

	@Test
	void test() {
		File file = new File("c:\\navya\\String.txt");
		assertEquals(1, BinaryInteger.writeBinary(file));
	}

}
