package de.goldkugel.etl.transport;

import java.util.List;
import de.goldkugel.etl.configuration.Configurable;

/**
 * 
 * @author Peter Pallaoro
 *
 */
public interface Transport extends Configurable {

  /**
   * 
   * @param l
   * @return
   */
  public int transport(List<Object> l);

  /**
   * 
   * @param l
   * @param amount
   * @return
   */
  public int transport(List<Object> l, int amount);

}
