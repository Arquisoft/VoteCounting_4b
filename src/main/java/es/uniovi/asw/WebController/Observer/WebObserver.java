package es.uniovi.asw.WebController.Observer;

import es.uniovi.asw.WebController.Main;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Daplerio on 7/4/16.
 */
public class WebObserver implements Observer {

	public void actualizar(Map<String, Integer> resultados) {

		Main.resultados = resultados;
	}

}
