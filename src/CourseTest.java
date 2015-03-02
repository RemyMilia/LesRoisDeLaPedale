package tests;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import classes.Coureur;
import classes.Course;

import junit.framework.TestCase;

public class CourseTest extends TestCase {
	private Course course1;
	private Course course2;
	private Coureur coureur;

	@Before
	protected void setUp() throws Exception {
		super.setUp();
		course1 = new Course(1, "Tour de France", 2, 3, 4);
		coureur = new Coureur();
		course1.setVainqueur(coureur);
		course2 = new Course();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		course1 = null;
		course2 = null;
		coureur = null;
	}

	@Test
	public void testGetIdCourse() {
		assertEquals("Vérification de l'Id", 1, course1.getIdCourse());
	}

	@Test
	public void testGetNomCourse() {
		assertEquals("Vérification du nom", "Tour de France", course1.getNomCourse());
	}

	@Test
	public void testGetVa() {
		assertEquals("Vérification ...", 2, course1.getVa());
	}

	@Test
	public void testGetSp() {
		assertEquals("Vérification ...", 3, course1.getSp());
	}
	
	@Test
	public void testGetMt() {
		assertEquals("Vérification ...", 4, course1.getMt());
	}

	@Test
	public void testGetVainqueur() {
		assertEquals("Vérification de getVainqueur", coureur, course1.getVainqueur());
	}
	
	@Test
	public void testSetVainqueur() {
		Coureur coureur2 = new Coureur();
		course2.setVainqueur(coureur2);
		assertEquals("Vérification de setCoureur", coureur2, course2.getVainqueur());
	}

}
