/**
 * 
 */
package de.goldkugel.data.atom;

import java.io.Serializable;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

/**
 * 
 * @author Peter Pallaoro
 *
 */
@Getter
@Setter
public class Atom implements Serializable {
	
	/**
	 * 
	 */
	@NonNull
	private String source = null;
	
	/**
	 * 
	 */
	private Integer entryIndex = null;
	
	/**
	 * 
	 */
	@NonNull
	private String name = null;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1574074894772892645L;
	
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
