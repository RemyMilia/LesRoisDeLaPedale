package tests;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import classes.CareTaker;
import classes.Coureur;
import classes.Course;
import classes.Equipe;
import classes.Originator;
import classes.Saison;

import junit.framework.TestCase;

public class SaisonTest extends TestCase {
	Course course;
	ArrayList<Equipe> equipes;
	Coureur coureur;
	Originator og;
	CareTaker ct;
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		course = null;
		equipes = null;
		coureur = null;
		og = null;
		ct = null;
	}

	@Test
	public void testSimulation() {
		course = new Course(1, "Tour de France", 9, 7, 8);
		Equipe equipe = new Equipe();
		coureur = new Coureur("Armstrong", 9, 7, 8);
		equipe.addCoureur(coureur);
		coureur.setEquipe(equipe);
		equipes = new ArrayList<Equipe>();
		equipes.add(equipe);
		og = new Originator();
		ct = new CareTaker();
		Saison.getInstance().simulation(course, equipes, og, ct);
		assertEquals("Vérification de la simulation", coureur,course.getVainqueur());
	}

}
