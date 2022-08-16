/**
 * 
 */
package de.goldkugel.data.structure;

import java.io.Serializable;

import lombok.Data;
import lombok.NonNull;

/**
 * 
 * @author Peter Pallaoro
 *
 */
@Data
public abstract class DataContainer implements Serializable {
	
	/**
	 * 
	 */
	@NonNull
	private String source = null;
	
	/**
	 * 
	 */
	@NonNull
	private DataContainer parent = null;
	
	/**
	 * 
	 */
	@NonNull
	private String name = null;
	
	/**
	 * 
	 */
	@NonNull
	private Integer entryIndex = null;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5607708716541220108L;
	
}
