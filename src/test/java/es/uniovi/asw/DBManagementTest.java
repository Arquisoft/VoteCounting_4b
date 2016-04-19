package es.uniovi.asw;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cucumber.api.java.Before;
import es.uniovi.asw.DBManagement.DBManagement;
import es.uniovi.asw.DBManagement.domain.Candidate;
import es.uniovi.asw.DBManagement.domain.PollingStation;
import es.uniovi.asw.DBManagement.domain.Vote;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class DBManagementTest {

	@Autowired
	DBManagement repository;
	List<Vote> votos = new ArrayList<Vote>();
	
	

	@Before
	public void before() {
		votos = repository.findAll();
		repository.deleteAll();

		repository.save(new Vote(new PollingStation(new Long(50), "Asturias", "Principado de Asturias"), Candidate.SI));
		repository.save(new Vote(new PollingStation(new Long(51), "Asturias", "Principado de Asturias"), Candidate.SI));
		repository.save(new Vote(new PollingStation(new Long(52), "Asturias", "Principado de Asturias"), Candidate.NO));
		repository.save(new Vote(new PollingStation(new Long(53), "Asturias", "Principado de Asturias"), Candidate.SI));
		repository.save(new Vote(new PollingStation(new Long(54), "Madrid", "Comunidad de Madrid"), Candidate.SI));
		repository.save(new Vote(new PollingStation(new Long(55), "Madrid", "Comunidad de Madrid"), Candidate.SI));
		repository.save(new Vote(new PollingStation(new Long(56), "Asturias", "Principado de Asturias"), Candidate.SI));
		repository
				.save(new Vote(new PollingStation(new Long(57), "León", "Comunidad de Castillo y León"), Candidate.NO));
		repository
				.save(new Vote(new PollingStation(new Long(58), "León", "Comunidad de Castillo y León"), Candidate.SI));
		repository
				.save(new Vote(new PollingStation(new Long(59), "León", "Comunidad de Castillo y León"), Candidate.NO));
		repository.save(
				new Vote(new PollingStation(new Long(60), "Extremadura", "Comunidad de Extremadura"), Candidate.SI));
		repository.save(
				new Vote(new PollingStation(new Long(61), "Extremadura", "Comunidad de Extremadura"), Candidate.NO));
		repository.save(new Vote(new PollingStation(new Long(62), "Asturias", "Principado de Asturias"), Candidate.SI));
		repository.save(
				new Vote(new PollingStation(new Long(63), "Extremadura", "Comunidad de Extremadura"), Candidate.NO));
		repository.save(new Vote(new PollingStation(new Long(64), "Asturias", "Principado de Asturias"), Candidate.SI));

	}

	@Test
	public void testFindAllVotes() {
		assertTrue(repository.findAll().size() == 15);
		assertFalse(repository.findAll().isEmpty());
	}

	@Test
	public void testFindByCandidate() {
		assertTrue(repository.findByCandidatura(Candidate.SI).size() == 10);
		
	}

}
