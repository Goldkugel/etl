/**
 * 
 */
package de.goldkugel.data.group;

import java.util.ArrayList;

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
public class Group extends DataContainer {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2734956718698729531L;
	
	/**
	 * 
	 */
	private ArrayList<DataContainer> elements = new ArrayList<DataContainer>();

	/**
	 * 
	 */
	public Group() {

	}
	
	
}
