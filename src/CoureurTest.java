package tests;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import classes.Coureur;
import classes.Equipe;

import junit.framework.TestCase;

public class CoureurTest extends TestCase {

	private Equipe e1;
	private Coureur coureur1;

	@Before
	protected void setUp() throws Exception {
		super.setUp();
		 e1 = new Equipe("Movistar", 1000000);
		
		coureur1 = new Coureur(1, 9, 7, 8, e1);
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		e1 = null;
		coureur1 = null;
	}

	@Test
	public void testGetIdCoureur() {
		assertEquals("Vérification de l'Id",1, coureur1.getIdCoureur());
	}

	@Test
	public void testGetNomCoureur() {
		assertEquals("Vérification du nom","C1", coureur1.getNomCoureur());
	}

	@Test
	public void testGetVa() {
		assertEquals("Vérification de ...",9, coureur1.getVa());
	}

	@Test
	public void testGetSp() {
		assertEquals("Vérification de ...",7, coureur1.getSp());
	}

	@Test
	public void testGetMt() {
		assertEquals("Vérification de ...mt",8, coureur1.getMt());
	}

	@Test
	public void testGetEq() {
		assertEquals("Vérification de l'équipe",e1, coureur1.getEq());
	}

}
