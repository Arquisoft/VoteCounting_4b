package es.uniovi.asw.Calculate.VotersType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Referendum {
	//sustituir los map de los list por la clase votos más adelante
	private List<Map<String,String>> votes;
	private Map<String, Integer> recuento;
	private  String YES;
	private String NO;
	private String WHITE;
	
	public Referendum(List<Map<String,String>> votes, String Yes, String No, String White){
		this.votes=votes;
		this.recuento = new HashMap<String,Integer>();
		this.YES=Yes;
		this.NO=No;
		this.WHITE=White;
		
		calcular();
	}

	private void calcular() {
		
	}
	
	public Map<String,Integer> result(){
		return recuento;
	}
}
