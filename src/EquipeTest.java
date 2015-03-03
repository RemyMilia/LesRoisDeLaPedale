package tests;


import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import classes.Coureur;
import classes.Equipe;
import classes.Sponsor;

import junit.framework.TestCase;

public class EquipeTest extends TestCase {

	private Equipe e1;
	private Equipe e2;
	private Sponsor sp;
	
	private Coureur coureur;
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();		
		e1 = new Equipe("Movistar");
		e2 = new Equipe();
		coureur = new Coureur();
		e1.addCoureur(coureur);
		sp = new Sponsor("sp", 1000000);
		e1.setSponsor(sp);

	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		e1 = null;
		e2 = null;
		coureur = null;
		sp = null;
	}

	@Test
	public void testGetNomE() {
		assertEquals("Vérification du nom","Movistar",e1.getNomE());
	}

	@Test
	public void testSetNomE() {
		e2.setNom("AG2R");
		assertEquals("Vérification du nom","AG2R",e2.getNomE());
	}

	@Test
	public void testGetSponsor() {
		assertEquals("Vérification du sponsor",sp,e1.getSponsor());
	}

	@Test
	public void testSetSponsor() {
		Sponsor sp2= new Sponsor("sp2", 500000);
		e2.setSponsor(sp2);
		assertEquals("Vérification du sponsor", sp2,e2.getSponsor());
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
	public void testAddCoureurToNullList() {
		assertNull("Vérification liste null", e2.getlistC());
		Coureur coureur2 = new Coureur();
		ArrayList <Coureur> listC = new ArrayList<Coureur>();
		listC.add(coureur2);
		e2.addCoureur(coureur2);
		assertEquals("Vérification des coureurs",listC,e2.getlistC());
	}
		
	@Test
	public void testToString() {
		assertEquals("Vérification de toString()","Movistar (sp au budget de 1000000)",e1.toString());
	}

}
