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
	public void testSetIdCourse() {
		course2.setIdCourse(0);
		assertEquals("Vérification de l'Id", 0, course2.getIdCourse());
	}

	@Test
	public void testGetNomCourse() {
		assertEquals("Vérification du nom", "Tour de France", course1.getNomCourse());
	}
	
	@Test
	public void testSetNomCourse() {
		course2.setNomCourse("Course2");
		assertEquals("Vérification du nom", "Course2", course2.getNomCourse());
	}

	@Test
	public void testGetVa() {
		assertEquals("Vérification vallon", 3, course1.getVa());
	}
	
	@Test
	public void testSetVa() {
		course2.setVa(8);
		assertEquals("Vérification vallon", 8, course2.getVa());
	}

	@Test
	public void testGetSp() {
		assertEquals("Vérification sprint", 2, course1.getSp());
	}

	@Test
	public void testSetSp() {
		course2.setSp(9);
		assertEquals("Vérification sprint", 9, course2.getSp());
	}
	
	@Test
	public void testGetMt() {
		assertEquals("Vérification montagne", 4, course1.getMt());
	}
	
	@Test
	public void testSetMt() {
		course2.setMt(7);
		assertEquals("Vérification montagne", 7, course2.getMt());
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
	
	@Test
	public void testToString() {
		assertEquals("Vérification toString", "Id 1 Tour de France (plaine:2,vallons: 3, montagne: 4)", course1.toString());
	}

}
