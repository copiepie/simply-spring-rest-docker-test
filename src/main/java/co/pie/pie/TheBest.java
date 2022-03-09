package co.pie.pie;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TheBest {
  private static final Logger LOGGER = LoggerFactory.getLogger(TheBest.class);

  @RequestMapping("/whoisthebest/{name}")
  public String whoIsTheBest(@PathVariable(value = "name") String name) {
    String theBest = String.format("%s is the best!", name);
    LOGGER.info(theBest);
    return theBest;
  }
}
