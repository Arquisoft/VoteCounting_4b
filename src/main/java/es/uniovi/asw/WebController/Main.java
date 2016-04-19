package es.uniovi.asw.WebController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;


@Controller
public class Main {

  private static final Logger LOG = LoggerFactory.getLogger(Main.class);
    public static Map<String, Integer> resultados;

  @RequestMapping("/")
  public String landing(Model model) {
    LOG.info("Landing page access");

      // Datos falsos temporales
      resultados = new HashMap<String, Integer>();
      resultados.put("SI", 50);
      resultados.put("NO", 50);

    model.addAttribute("resultados",prepararArray());
    return "index";
  }

    private int[] prepararArray() {
        int[] array = new int[resultados.size()];
        for(int i=0;i<resultados.size();i++)
        {
            array[i] = resultados.get(i);
        }
        return array;
    }
  
}