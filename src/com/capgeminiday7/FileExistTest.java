package com.capgeminiday7;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

class FileExistTest {

	@Test
	void testFile() {
		File  file=new File("c:\\navya\\");
		assertEquals(true, file.exists());

	}

}
