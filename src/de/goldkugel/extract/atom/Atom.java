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
	@NonNull
	private String source = null;
	
	/**
	 * 
	 */
	@NonNull
	private Integer entryIndex = null;
	
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
	
	/**
	 * 
	 * @param name
	 * @param content
	 * @param source
	 */
	public Atom(String name, String content, String source) {
		this(name, content);
		this.setSource(source);
	}
	
	/**
	 * 
	 * @param name
	 * @param content
	 * @param source
	 * @param index
	 */
	public Atom(String name, String content, String source, Integer index) {
		this(name, content, source);
		this.setEntryIndex(index);
	}
}
