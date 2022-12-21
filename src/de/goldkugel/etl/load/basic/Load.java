package de.goldkugel.etl.load.basic;

import java.util.List;

import de.goldkugel.etl.Configurable;

/**
 * 
 * @author Peter Pallaoro
 *
 */
public interface Load extends Configurable {

	/**
	 * 
	 * @param l
	 * @return
	 */
	public int write(List<Object> l);
	
	/**
	 * 
	 * @param l
	 * @param amount
	 * @return
	 */
	public int write(List<Object> l, int amount);
	
}
