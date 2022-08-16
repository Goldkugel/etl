/**
 * 
 */
package de.goldkugel.storage;

import de.goldkugel.data.atom.Atom;

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
	public Atom read();
	
	/**
	 * 
	 * @param dc
	 */
	public void write(Atom dc);
	
	/**
	 * 
	 * @param dc
	 */
	public void update(Atom dc);
	
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
