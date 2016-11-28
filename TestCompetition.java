package tests;

import static org.junit.Assert.*;
import inscriptions.Competition;
import inscriptions.Inscriptions;
import inscriptions.Personne;

import org.junit.Test;

public class TestCompetition {
	Inscriptions i = Inscriptions.getInscriptions();
	Competition co = i.createCompetition("volley", null, true);
	Personne pe=i.createPersonne("Felana", "Manyado", "fefe@gmail.com");
			



	@Test
	public void testGetNom() {
		assertNotNull(co.getNom());
	}

	@Test
	public void testSetNom() {
		fail("Not yet implemented");
	}

	@Test
	public void testInscriptionsOuvertes() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetDateCloture() {
		assertNotNull(co.getDateCloture());
	}

	@Test
	public void testEstEnEquipe() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetDateCloture() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCandidats() {
		assertNotNull(co.getCandidats());
	}

	
	@Test
	public void testAddPersonne() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddEquipe() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemove() {
		assert(co.remove(pe));
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	public void testCompareTo() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented"); 
	}

}
