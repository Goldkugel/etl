/**
 * 
 */
package de.goldkugel.storage;

import de.goldkugel.data.structure.DataContainer;

/**
 * 
 * @author Peter Pallaoro
 *
 */
public interface Storage {

	/**
	 * 
	 * @return
	 */
	public DataContainer read();
	
	/**
	 * 
	 * @param dc
	 */
	public void write(DataContainer dc);
	
	/**
	 * 
	 * @param dc
	 */
	public void update(DataContainer dc);
	
	/**
	 * 
	 * @return
	 */
	public Long getReadCount();
	
	/**
	 * 
	 * @return
	 */
	public Long getWriteCount();
	
	/**
	 * 
	 * @return
	 */
	public Long getUpdateCount();
}
