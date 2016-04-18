package es.uniovi.asw.Calculate.voters;

import java.util.List;
import java.util.Map;

import es.uniovi.asw.DBManagement.GetVotes;
import es.uniovi.asw.DBManagement.domain.Vote;

public class ReferendumType implements VotersType{
	
	private Referendum tipo;

	public  ReferendumType(List<Vote> votes) {
		tipo = new Referendum();
	}
	
	@Override
	public Map<String, Integer> getResult() {
		return tipo.getResult();
	}

	@Override
	public void actualize(GetVotes votes) {
		for(Vote v: votes.getVotes()){
			if(!v.isContabilizado()){
				
				votes.updateVote(v.getId());//actualizamos el estado del voto
			}
		}
		
	}

}
