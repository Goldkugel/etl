/**
 * 
 */
package de.goldkugel.extract;

import de.goldkugel.extract.storage.Storage;

/**
 * 
 * @author Peter Pallaoro
 *
 */
public interface Extract extends Runnable {
	
	/**
	 * 
	 * @param storage
	 */
	public void setStorage(Storage storage);
	
	/**
	 * 
	 * @return
	 */
	public Storage getStorage();
	
}
