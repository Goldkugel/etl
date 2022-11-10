/**
 * 
 */
package de.goldkugel.etl;

/**
 * 
 * @author Peter Pallaoro
 *
 */
public interface Configurable extends Runnable {

	/**
	 * 
	 * @param configFile
	 * @param configDictionary
	 * @return
	 */
	public int open(String configFile, String configDictionary);
	
	/**
	 * 
	 * @return
	 */
	public int close();
	
}
