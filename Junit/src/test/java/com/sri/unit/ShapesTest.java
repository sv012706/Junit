package com.sri.unit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class ShapesTest {
	Shapes sh=new Shapes();

	@Test
	void test() {
		assertEquals(121, sh.areaofSquare(11));
		assertEquals(78.5,sh.areaofCircle(5));
		assertEquals(254.34,sh.areaofCircle(9),()->"Area of circle is not correct");
		assertNotEquals(49,sh.areaofCircle(8),()->"area of circle is correct");
		
		String str="srikanth";
		assertTrue(str.equals(str));
		
		assertFalse(str.equalsIgnoreCase(str));
	}

}
