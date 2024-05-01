package com.Unit.String;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class revStringTest {
	revString rev=new revString();
	@Test
	void test_oneWord() {
		
		assertEquals("unhsiV", rev.reverseString("Vishnu"));
	}
	@Test
 void test_multipleWord() {
		
		assertEquals("u r erehw unhsiV", rev.reverseString("Vishnu where r u"));
	}

}
