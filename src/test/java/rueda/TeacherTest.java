package rueda;

import static org.junit.Assert.assertSame;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TeacherTest {

	Teacher teacher;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("al principio de todo");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("al final de todo");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("antes");
		teacher = Teacher.getInstance();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("despues");
	}

	@Test
	public void testIfGetInstanceAlwaysReturnSameObject() {
		assertSame(Teacher.getInstance(), teacher);
	}


	@Test
	public void testIfGetInstanceAlwaysReturnSameObject7() {
		assertSame(Teacher.getInstance(), teacher);
	}

	@Test
	public void testIfGetInstanceAlwaysReturnSameObject6() {
		assertSame(Teacher.getInstance(), teacher);
	}

	@Test
	public void testIfGetInstanceAlwaysReturnSameObject5() {
		assertSame(Teacher.getInstance(), teacher);
	}

	@Test
	public void testIfGetInstanceAlwaysReturnSameObject2() {
		assertSame(Teacher.getInstance(), teacher);
	}

	@Test
	public void testIfGetInstanceAlwaysReturnSameObject3() {
		assertSame(Teacher.getInstance(), teacher);
	}

	@Test
	public void testIfGetInstanceAlwaysReturnSameObject4() {
		assertSame(Teacher.getInstance(), teacher);
	}

}
