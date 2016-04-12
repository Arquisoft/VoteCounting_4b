package es.uniovi.asw.Calculate.VotersType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.uniovi.asw.DBManagement.domain.Vote;

public class Referendum {
	//sustituir los map de los list por la clase votos más adelante
	private List<Vote> votes;
	private Map<String, Integer> recuento;
	private String YES;
	private String NO;
	private String WHITE;
	
	public Referendum(List<Vote> votes, String Yes, String No, String White){
		this.votes=votes;
		this.recuento = new HashMap<String,Integer>();
		this.YES=Yes;
		this.NO=No;
		this.WHITE=White;
		
		iniciar();
		calcular();
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
