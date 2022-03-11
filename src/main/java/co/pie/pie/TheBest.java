package co.pie.pie;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TheBest {
  private static final Logger LOGGER = LoggerFactory.getLogger(TheBest.class);

  @RequestMapping("/")
  public String whoIsTheBest() {
    String arch = System.getProperty("os.arch");
    LOGGER.info(arch);
    return arch;
  }
}
