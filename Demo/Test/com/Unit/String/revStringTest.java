package com.Unit.String;

import static org.junit.Assert.*;

import org.junit.Test;

public class revStringTest {

	@Test
	public void test() {
		revString rev=new revString();
		assertEquals("avaJ", rev.reverseString("Java"));
		
	}

}
