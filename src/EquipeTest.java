package tests;


import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import classes.Coureur;
import classes.Equipe;

import junit.framework.TestCase;

public class EquipeTest extends TestCase {

	private Equipe e1;
	private Equipe e2;
	
	private Coureur coureur;
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();		
		e1 = new Equipe("Movistar", 1000000);
		e2 = new Equipe();
		e1.addCoureur(coureur);

	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		e1 = null;
		e2 = null;
	}

	@Test
	public void testGetNomE() {
		assertEquals("Vérification du nom","Movistar",e1.getNomE());
	}

	@Test
	public void testGetBudget() {
		assertEquals("Vérification du budget",1000000,e1.getBudget());
	}

	@Test
	public void testGetlistC() {
		ArrayList <Coureur> listC = new ArrayList<Coureur>();
		listC.add(coureur);
		assertEquals("Vérification des coureurs",listC,e1.getlistC());
	}
	
	@Test
	public void testAddCoureur() {
		Coureur coureur2 = new Coureur();
		ArrayList <Coureur> listC = new ArrayList<Coureur>();
		listC.add(coureur2);
		e2.addCoureur(coureur2);
		assertEquals("Vérification des coureurs",listC,e2.getlistC());
	}
	
	@Test
	public void testToString() {
		assertEquals("Vérification de toString()","Movistar (1000000)",e1.toString());
	}

}
