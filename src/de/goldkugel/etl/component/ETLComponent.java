package de.goldkugel.etl.component;

import de.goldkugel.etl.configuration.Configurable;

/**
 * This interface is the basic interface for all etl components.
 * 
 * For any realisation of this interface it should be checked if some
 * parts have been already implemented in some classes for example
 * some methods of the Configurable interface have been already
 * implemented in the class ConfigurableObject.
 *
 * @author Peter Pallaoro
 *
 */
public interface ETLComponent extends Configurable {

  /**
   * Opens the ETLComponent. Here everything which is needed to process
   * data is set up. Do not change any configuration in this method
   * since there is already an intended method for this. This method
   * initialises further objects for example Sockets and Files etc. for
   * use with the configuration which has been set previously.
   * 
   * @return the return value should be zero if the initialisation was
   *         successful, if the return value is above zero, warnings
   *         have occurred, while if the return value is below zero,
   *         errors occurred. For every warning and/or error a specific
   *         value is returned. This should be noted while implementing
   *         this method.
   */
  public int open();

  /**
   * Closes the ETLComponent. here everything which is needed to process
   * data is closed. Do not close any configuration in this method since
   * there is already an intended method for this. This method closes
   * further objects for example Sockets and Files etc. after usage.
   * 
   * @return the return value should be zero if the deinitialisation was
   *         successful, if the return value is above zero, warnings
   *         have occurred, while if the return value is below zero,
   *         errors occurred. For every warning and/or error a specific
   *         value is returned. This should be noted while implementing
   *         this method.
   */
  public int close();

}
