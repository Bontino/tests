package tests;

import static org.junit.Assert.*;
import junit.framework.TestCase;
import inscriptions.Competition;
import inscriptions.Inscriptions;

import org.junit.Test;

public class TestInscriptions extends TestCase{
	Inscriptions i;
	//Competition c=i.CreateCompetition("foot","12/01/01",true);
	
	protected void setUp() throws Exception {
		i=	Inscriptions.getInscriptions();
	}

	@Test
	public void testGetInscriptions()  {
		assertNotNull(i);
	}
	
	@Test
	public void testreinitialiser(){
		i.reinitialiser();
		assertNotEquals(Inscriptions.getInscriptions(),i);
	}
	
	
	@Test
	public void testGetCompetitions() {
		assertNotNull(i,getcompetitions);
	}

	@Test
	public void testGetCandidats() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPersonnes() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetEquipes() {
		fail("Not yet implemented");
	}

	@Test
	public void testCreateCompetition() {
		fail("Not yet implemented");
	}

	@Test
	public void testCreatePersonne() {
		fail("Not yet implemented");
	}

	@Test
	public void testCreateEquipe() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveCompetition() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveCandidat() {
		fail("Not yet implemented");
	}



}
