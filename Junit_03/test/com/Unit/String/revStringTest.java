package com.Unit.String;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

	class revStringTest {

		@Test
		void test() {
			revString rev=new revString();
			assertEquals("unhsiV", rev.reverseString("Vishnu"));
			assertEquals("htnakirS", rev.reverseString("Srikanth"));
		}

	}
