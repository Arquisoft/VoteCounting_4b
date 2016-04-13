package es.uniovi.asw.Calculate.info;

import java.util.Map;

public interface  ObjectInfo {

	public void actualiza(Map<String,Integer> resultados);
	public Map<String,Integer> getResultado();
	//public Map<String,Map<String,Integer>> getEstadisticas;
	
}
