package tests;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import classes.Course;

import junit.framework.TestCase;

public class CourseTest extends TestCase {
	private Course course;

	@Before
	protected void setUp() throws Exception {
		super.setUp();
		course = new Course(1, "Tour de France", 2, 3, 4);
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		course = null;
	}

	@Test
	public void testGetIdCourse() {
		assertEquals("Vérification de l'Id", 1, course.getIdCourse());
	}

	@Test
	public void testGetNomCourse() {
		assertEquals("Vérification du nom", "Tour de France", course.getNomCourse());
	}

	@Test
	public void testGetVa() {
		assertEquals("Vérification ...", 2, course.getVa());
	}

	@Test
	public void testGetSp() {
		assertEquals("Vérification ...", 3, course.getSp());
	}

	@Test
	public void testGetMt() {
		assertEquals("Vérification ...", 4, course.getMt());
	}

}
