package tests;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import classes.Sponsor;

import junit.framework.TestCase;

public class SponsorTest extends TestCase {
	private Sponsor sponsor1, sponsor2;

	@Before
	protected void setUp() throws Exception {
		super.setUp();
		sponsor1 = new Sponsor("sponsor1", 1000000);
		sponsor2 = new Sponsor("sponsor2", 1000000);
		
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		sponsor1 = null;
		sponsor2 = null;
	}

	@Test
	public void testGetNomS() {
		assertEquals("Vérification du nom", "sponsor1", sponsor1.getNomS());
	}

	@Test
	public void testGetBudget() {
		assertEquals("Vérification du budget", 1000000, sponsor1.getBudget());
	}

	@Test
	public void testSetNomS() {
		sponsor2.setNomS("newSponsor");
		assertEquals("Vérification du nom", "newSponsor", sponsor2.getNomS());
	}

	@Test
	public void testSetBudget() {
		sponsor2.setBudget(500000);
		assertEquals("Vérification du budget", 500000, sponsor2.getBudget());
	}

	@Test
	public void testToString() {
		assertEquals("Vérification toString", "sponsor1 au budget de 1000000", sponsor1.toString());
	}

}
