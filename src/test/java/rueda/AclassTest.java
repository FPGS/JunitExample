package rueda;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.awt.Point;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AclassTest {

	Aclass miclase;

	@BeforeEach
	void setUp() throws Exception {
		miclase = new Aclass();
	}

	@Test
	void testLocateOnZeroCoordinates() {
		try {
			miclase.locate(0, 0);
			fail("no pasaras");
		} catch (Exception e) {
		}
	}

	@Test
	void testLocateOnNegativeCoordinates() {
		Point point = miclase.locate(-1, -1);
		assertEquals(1.0, point.getX(), 0.1);
		assertTrue(1.0 - point.getX() < 0.1);

		assertEquals(1.0, point.getY(), 0.1);
		assertEquals(new Point(1, 1), point);
	}

	@Test
	void testLocate() {
		Point point = miclase.locate(7, 8);
		assertEquals(7.0, point.getX(), 0.1);
		assertEquals(8.0, point.getY(), 0.1);
	}

	@Test
	void testNotTringle() {
		try {
			miclase.getArea(7.0, 1.4, 1.5);
			fail("no pasaras");
		} catch (Exception e) {
		}

		try {
			miclase.getArea(1.0, 1.4, 16.5);
			fail("no pasaras");
		} catch (Exception e) {
		}

		try {
			miclase.getArea(1.0, 6.4, 1.5);
			fail("no pasaras");
		} catch (Exception e) {
		}
	}


	@Test
	void testGetArea() {
		assertEquals(22.1541, miclase.getArea(7.0, 8.4, 6.5), 0.001);
	}

}
