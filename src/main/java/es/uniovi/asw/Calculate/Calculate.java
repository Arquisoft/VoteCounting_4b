package es.uniovi.asw.Calculate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.uniovi.asw.Calculate.VotersType.VotersType;
import es.uniovi.asw.Calculate.info.ObjectInfo;
import es.uniovi.asw.DBManagement.DBManagement;
import es.uniovi.asw.DBManagement.GetVotes;
import es.uniovi.asw.DBManagement.domain.Vote;

@Component("Calculate")
public class Calculate implements GetVotes {

	@Autowired
	private DBManagement repository;

	private VotersType type;
	private List<Vote> vots;
	private ObjectInfo info;

	public Calculate(DBManagement repository) {
		this.repository = repository;

	}

	public Calculate(VotersType type, ObjectInfo info) {
		this.type = type;
		this.info = info;

		this.vots = getVotes();
	}

	private void sendInfo() {
		info.actualiza(type.getResult());
		// pasar info como param. a la web
	}

	public void actualiceC() {
		vots = getVotes();
		info.actualiza(type.getResult());
	}

	@Override
	public List<Vote> getVotes() {
		return repository.findAll();
	}

	@Override
	public void updateVote(Long id) {
		Vote voto = repository.findOne(id);
		voto.setContabilizado(true);
		repository.save(voto);

	}

	public DBManagement getRepository() {
		return repository;
	}

	public void setRepository(DBManagement repository) {
		this.repository = repository;
	}

	public List<Vote> getVots() {
		return vots;
	}

	public void setVots(List<Vote> vots) {
		this.vots = vots;
	}
}
