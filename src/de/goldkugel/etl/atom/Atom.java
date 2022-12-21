package de.goldkugel.etl.atom;

import java.io.Serializable;

import lombok.Data;

/**
 * 
 * @author Peter Pallaoro
 *
 */
@Data
public class Atom implements Serializable {

	private static final long serialVersionUID = 1973437748746859444L;

	//
	protected AtomType type = null;
	
	//
	protected String content = null;
	
}
