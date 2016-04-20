package es.uniovi.asw;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

import org.springframework.beans.factory.annotation.Autowired;

import cucumber.api.java.Before;
import es.uniovi.asw.DBManagement.DBManagement;
import es.uniovi.asw.DBManagement.PollingStationManagement;
import es.uniovi.asw.DBManagement.domain.Candidate;
import es.uniovi.asw.DBManagement.domain.PollingStation;
import es.uniovi.asw.DBManagement.domain.Vote;

public class DBManagementTest {

	@Autowired
	DBManagement repository;
	List<Vote> votos = new ArrayList<Vote>();

	@Autowired
	PollingStationManagement colegioRepository;

	@Before
	public void before() {
		repository.deleteAll();

		colegioRepository.save(new PollingStation(new Long(50), "Asturias", "Principado de Asturias"));
		colegioRepository.save(new PollingStation(new Long(51), "Madrid", "Comunidad de Madrid"));
		colegioRepository.save(new PollingStation(new Long(52), "León", "Comunidad de Castillo y León"));
		colegioRepository.save(new PollingStation(new Long(53), "Extremadura", "Comunidad de Extremadura"));

		repository.save(new Vote(colegioRepository.findByCircunscripcion("Asturias").get(0), Candidate.SI));
		repository.save(new Vote(colegioRepository.findByCircunscripcion("Asturias").get(0), Candidate.SI));
		repository.save(new Vote(colegioRepository.findByCircunscripcion("Asturias").get(0), Candidate.NO));
		repository.save(new Vote(colegioRepository.findByCircunscripcion("Asturias").get(0), Candidate.SI));
		repository.save(new Vote(colegioRepository.findByCircunscripcion("Madrid").get(0), Candidate.SI));
		repository.save(new Vote(colegioRepository.findByCircunscripcion("Madrid").get(0), Candidate.SI));
		repository.save(new Vote(colegioRepository.findByCircunscripcion("León").get(0), Candidate.SI));
		repository.save(new Vote(colegioRepository.findByCircunscripcion("León").get(0), Candidate.NO));
		repository.save(new Vote(colegioRepository.findByCircunscripcion("León").get(0), Candidate.SI));
		repository.save(new Vote(colegioRepository.findByCircunscripcion("León").get(0), Candidate.NO));
		repository.save(new Vote(colegioRepository.findByCircunscripcion("Extremadura").get(0), Candidate.SI));
		repository.save(new Vote(colegioRepository.findByCircunscripcion("Extremadura").get(0), Candidate.NO));
		repository.save(new Vote(colegioRepository.findByCircunscripcion("Extremadura").get(0), Candidate.SI));
		repository.save(new Vote(colegioRepository.findByCircunscripcion("Extremadura").get(0), Candidate.NO));
		repository.save(new Vote(colegioRepository.findByCircunscripcion("Extremadura").get(0), Candidate.SI));

	}

	@Test
	public void testFindAllVotes() {
		assertTrue(repository.findAll().size() == 15);
	}

	@Test
	public void testFindByCandidate() {
		assertTrue(repository.findByCandidatura(Candidate.SI).size() == 10);

	}

}
