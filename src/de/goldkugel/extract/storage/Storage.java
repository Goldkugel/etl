/**
 * 
 */
package de.goldkugel.extract.storage;

import de.goldkugel.extract.atom.Atom;

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
	 * @param atom
	 */
	public void write(Atom atom);
	
	/**
	 * 
	 * @param atom
	 */
	public void update(Atom atom);
	
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
