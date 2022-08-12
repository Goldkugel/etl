/**
 * 
 */
package de.goldkugel.extract.atom;

import java.io.Serializable;

import lombok.Data;
import lombok.NonNull;

/**
 * 
 * @author Peter Pallaoro
 *
 */
@Data
public class Atom implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1574074894772892645L;
	
	/**
	 * 
	 */
	@NonNull
	private String name = null;
	
	/**
	 * 
	 */
	private String content = null;

	/**
	 * 
	 */
	public Atom() {
		
	}
	
	/**
	 * 
	 * @param name
	 */
	public Atom(String name) {
		this.setName(name);
	}
	
	/**
	 * 
	 * @param name
	 * @param content
	 */
	public Atom(String name, String content) {
		this(name);
		this.setContent(content);
	}
}
