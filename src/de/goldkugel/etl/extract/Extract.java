/**
 * 
 */
package de.goldkugel.etl.extract;

import java.util.List;

import de.goldkugel.etl.Configurable;

/**
 * 
 * @author Peter Pallaoro
 *
 */
public interface Extract  extends Configurable  {
	
	/**
	 * 
	 * @param l
	 * @return
	 */
	public int read(List<Object> l);
	
	/**
	 * 
	 * @param l
	 * @param amount
	 * @return
	 */
	public int read(List<Object> l, int amount);
	
}
