/**
 * 
 */
package de.goldkugel.data.atomlist;

import java.util.ArrayList;

import de.goldkugel.data.atom.Atom;
import de.goldkugel.data.structure.DataContainer;
import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author Peter Pallaoro
 *
 */
@Getter
@Setter
public class AtomList extends DataContainer {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4509894563477324269L;
	
	/**
	 * 
	 */
	private ArrayList<Atom> list = new ArrayList<Atom>();

	/**
	 * 
	 */
	public AtomList() {

	}

}
