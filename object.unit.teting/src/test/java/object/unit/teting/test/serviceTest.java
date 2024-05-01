package object.unit.teting.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import object.unit.testing.service.Service;
import object.unit.teting.dao.Java;



class serviceTest {

	@Test
	void test() {
		Service service=new Service();
		boolean status=service.purchasedCourse(new Java());
		assertTrue(status);
		assertFalse(false);
		
	}

}
