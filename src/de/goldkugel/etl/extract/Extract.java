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
	
	public int read(List<Object> l);
	
	public int read(List<Object> l, int amount);
	
}
