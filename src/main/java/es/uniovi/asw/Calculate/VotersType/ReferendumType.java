package es.uniovi.asw.Calculate.VotersType;

import java.util.List;
import java.util.Map;

import es.uniovi.asw.DBManagement.domain.Vote;

public class ReferendumType implements VotersType{
	
	private Referendum tipo;

	
	public  ReferendumType(List<Vote> votes, String Yes, String No, String White) {
		tipo = new Referendum(votes, Yes, No, White);
	}
	
	@Override
	public Map<String, Integer> getResult() {
		return tipo.getResult();
	}

	@Override
	public void actualize(List<Vote> votes) {
		tipo.actualizar(votes);
		
	}

}
