package tests;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import classes.Equipe;

import junit.framework.TestCase;

public class EquipeTest extends TestCase {

	private Equipe e1;
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();		
		e1 = new Equipe("Movistar", 1000000);

	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		e1 = null;
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
		assertEquals("Vérification des coureurs",null,e1.getlistC());
	}

}
