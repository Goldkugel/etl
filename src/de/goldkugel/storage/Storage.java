/**
 * 
 */
package de.goldkugel.storage;

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
	public Object read();
	
	/**
	 * 
	 * @param dc
	 */
	public void write(Object o);
	
	/**
	 * 
	 * @param dc
	 */
	public void update(Object o);
	
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
