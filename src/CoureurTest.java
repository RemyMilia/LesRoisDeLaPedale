package tests;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import classes.Coureur;
import classes.Equipe;
import classes.Sponsor;

import junit.framework.TestCase;

public class CoureurTest extends TestCase {

	private Equipe e1;
	private Coureur coureur1, coureur2;
	private Sponsor sp;

	@Before
	protected void setUp() throws Exception {
		super.setUp();
		 e1 = new Equipe("Movistar");
		 sp = new Sponsor("sp", 1000000);
		 e1.setSponsor(sp);
		
		coureur1 = new Coureur("Armstrong", 9, 7, 8);
		coureur1.setEquipe(e1);
		coureur1.setIdCoureur(0);
		coureur1.abandon = true;
		coureur2 = new Coureur();
		coureur2.chute = 1;
		coureur2.crev = 2;
		coureur2.abandon = true;
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		e1 = null;
		coureur1 = null;
		coureur2 = null;
		sp = null;
	}

	@Test
	public void testGetIdCoureur() {
		assertEquals("Vérification de l'Id",0, coureur1.getIdCoureur());
	}

	@Test
	public void testGetNomCoureur() {
		assertEquals("Vérification du nom","Armstrong", coureur1.getNomCoureur());
	}

	@Test
	public void testSetNomCoureur() {
		coureur2.setNomCoureur("Poulidor");
		assertEquals("Vérification du nom","Poulidor", coureur2.getNomCoureur());
	}

	@Test
	public void testGetVa() {
		assertEquals("Vérification de vallon",7, coureur1.getVa());
	}

	@Test
	public void testSetVa() {
		coureur2.setVa(7);
		assertEquals("Vérification de vallon",7, coureur2.getVa());
	}

	@Test
	public void testGetSp() {
		assertEquals("Vérification de sprint",9, coureur1.getSp());
	}

	@Test
	public void testSetSp() {
		coureur2.setSp(8);
		assertEquals("Vérification de sprint",8, coureur2.getSp());
	}

	@Test
	public void testGetMt() {
		assertEquals("Vérification de montagne",8, coureur1.getMt());
	}

	@Test
	public void testSetMt() {
		coureur2.setMt(7);	
		assertEquals("Vérification de montagne",7, coureur2.getMt());
	}

	@Test
	public void testGetEq() {
		assertEquals("Vérification de l'équipe",e1, coureur1.getEq());
	}

	@Test
	public void testSetEq() {
		Equipe e2 = new Equipe();
		coureur2.setEquipe(e2);
		assertEquals("Vérification de l'équipe",e2, coureur2.getEq());
	}

	@Test
	public void testToString() {
		assertEquals("Vérification de toString()","Armstrong! Equipe Movistar (sp au budget de 1000000) | Grimpeur 8 | Sprinteur: 9 | Puncheur 7", coureur1.toString());
	}

	@Test
	public void testGetStatus() {
		coureur2.getStatus();
	}
	
	@Test
	public void testReset() {
		coureur2.reset();
		assertEquals("Vérification de reset(chute)",0, coureur2.chute);
		assertEquals("Vérification de reset(crevaison)",0, coureur2.crev);
		assertEquals("Vérification de reset(abandon)",false, coureur2.abandon);
	}

}
