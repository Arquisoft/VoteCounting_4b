package es.uniovi.asw.Calculate.VotersType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.uniovi.asw.DBManagement.domain.Vote;

public class Referendum {
	//sustituir los map de los list por la clase votos más adelante
	private List<Vote> votes;
	private Map<String, Integer> recuento;
	//private Map<String,Map<String,Integer>> estadistica;
	private static final String YES = "Yes";
	private String NO = "No";
	private String WHITE = "White";
	
	public Referendum(){
		this.recuento = new HashMap<String,Integer>();	
		iniciar();
	}

	private void iniciar(){
		recuento.put(YES, 0);recuento.put(NO, 0);recuento.put(WHITE, 0);
	}
	
	private void calcular() {
		for(Vote v: votes){
			recuento.put("", 0);
		}
	}
	
	public void actualizar(List<Vote> newVotes){
		this.votes = newVotes;
		calcular();
	}
	
	public Map<String,Integer> getResult(){
		return recuento;
	}
}
