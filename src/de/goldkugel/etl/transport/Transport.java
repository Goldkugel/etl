/**
 * 
 */
package de.goldkugel.etl.transport;

import java.util.List;

import de.goldkugel.etl.Configurable;

/**
 * 
 * @author Peter Pallaoro
 *
 */
public interface Transport  extends Configurable {

	/**
	 * 
	 * @param l
	 * @return
	 */
	public int process(List<Object> l);
	
	/**
	 * 
	 * @param l
	 * @param amount
	 * @return
	 */
	public int process(List<Object> l, int amount);
	
}
