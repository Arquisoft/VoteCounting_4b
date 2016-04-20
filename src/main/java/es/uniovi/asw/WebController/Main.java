package es.uniovi.asw.WebController;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Main {
	public static Map<String, Double> resultados;

	@RequestMapping("/")
	public String landing(Model model) {

		// Datos falsos temporales
		resultados = new HashMap<String, Double>();
		resultados.put("SI", 50.0);
		resultados.put("NO", 50.0);

		int[] aux = new int[2];
		aux[0] = 70;
		aux[1] = 30;

		model.addAttribute("resultados", aux);
		return "index";
	}

	private double[] prepararArray() {
		double[] array = new double[resultados.size()];
		for (int i = 0; i < resultados.size(); i++) {
			array[i] = resultados.get(i);
		}
		return array;
	}

}