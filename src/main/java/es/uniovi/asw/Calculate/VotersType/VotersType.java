package es.uniovi.asw.Calculate.VotersType;

import java.util.List;
import java.util.Map;

import es.uniovi.asw.DBManagement.domain.Vote;

public interface VotersType {

	public Map<String,Integer> getResult();
	public void actualize(List<Vote> votes);
	
}
