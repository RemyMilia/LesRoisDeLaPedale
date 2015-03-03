package tests;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import classes.CareTaker;
import classes.Memento;
import classes.Originator;

import junit.framework.TestCase;

public class MementoTest extends TestCase {
	private Memento mem;
	private Originator og;
	private CareTaker ct;

	@Before
	protected void setUp() throws Exception {
		super.setUp();
		mem = new Memento(1, "Armstrong", "Tour de France");
		og = new Originator();
		ct = new CareTaker();
		ct.add(mem);
		og.getFormeFromMemento(mem);
		og.setForme(2);
		og.setCoureur("Poulidor");
		og.setCourse("Course1");
		og.saveFormeToMemento();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		mem = null;
		og = null;
		ct = null;
	}

	@Test
	public void testGetState() {
		assertEquals("Vérification de la forme", 1, mem.getState());
		assertEquals("Vérification de la forme", 2, og.getState());	
	}
	
	@Test
	public void testGetCoureur() {
		assertEquals("Vérification du coureur", "Armstrong", mem.getCoureur());
		assertEquals("Vérification du coureur", "Poulidor", og.getCoureur());	
	}
	
	@Test
	public void testGetCourse() {
		assertEquals("Vérification de la course", "Tour de France", mem.getCourse());
		assertEquals("Vérification de la course", "Course1", og.getCourse());	
	}
	
	@Test
	public void testGetMemento() {
		assertEquals("Vérification de la course", mem, ct.get(0));
}

}
