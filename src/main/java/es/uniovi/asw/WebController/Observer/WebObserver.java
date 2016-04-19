package es.uniovi.asw.WebController.Observer;

import java.util.Map;

import es.uniovi.asw.WebController.Main;

/**
 * Created by Daplerio on 7/4/16.
 */
public class WebObserver implements Observer {

	public void actualizar(Map<String, Double> resultados) {

		Main.resultados = resultados;
	}

}
