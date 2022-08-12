/**
 * 
 */
package de.goldkugel.extract;

import de.goldkugel.extract.storage.Storage;
import lombok.Data;
import lombok.NonNull;

/**
 * 
 * @author Peter Pallaoro
 *
 */
@Data
public abstract class Extract {
	
	/**
	 * 
	 */
	@NonNull
	private Storage storage = null;
	
	
	public Extract(Storage storage) {
		this.setStorage(storage);
	}
}
