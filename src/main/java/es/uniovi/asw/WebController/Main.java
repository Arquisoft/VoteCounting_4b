package es.uniovi.asw.WebController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Main {

  private static final Logger LOG = LoggerFactory.getLogger(Main.class);

  @RequestMapping("/")
  public String landing(Model model) {
    LOG.info("Landing page access");
    return "index";
  }
  
}