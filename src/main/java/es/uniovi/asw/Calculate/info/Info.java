package es.uniovi.asw.Calculate.info;

import java.util.Map;

public class Info implements ObjectInfo {
	
	private Map<String,Integer> resultados;
	//private List<Map<String,Integer>> estadisticas;
	
	@Override
	public void actualiza(Map<String,Integer> resultados) {
		this.resultados=resultados;
		}

	@Override
	public Map<String, Integer> getResultado() {
		return resultados;
	}

}
