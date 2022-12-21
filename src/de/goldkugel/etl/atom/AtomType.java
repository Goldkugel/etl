package de.goldkugel.etl.atom;

import java.io.Serializable;

import lombok.Data;
import lombok.NonNull;

/**
 * 
 * @author Peter Pallaoro
 *
 */
@Data
public class AtomType implements Serializable {
	
	private static final long serialVersionUID = -6808427998371142235L;

	protected final String name;
	
	public AtomType(@NonNull String name) {
		this.name = name;
	}
	
}
