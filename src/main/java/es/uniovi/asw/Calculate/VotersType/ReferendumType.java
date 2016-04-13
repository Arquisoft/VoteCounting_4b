package es.uniovi.asw.Calculate.VotersType;

import java.util.List;
import java.util.Map;

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
	
	/*@Override
	public List<Map<String, Integer>> getStatics() {
		return null;
	}*/

	@Override
	public void actualize(List<Vote> votes) {
		tipo.actualizar(votes);
		}

	

}
