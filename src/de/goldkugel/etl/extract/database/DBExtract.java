/**
 * 
 */
package de.goldkugel.etl.extract.database;

import java.util.List;

import de.goldkugel.etl.extract.basic.Extract;

/**
 * @author peterpallaoro
 *
 */
public abstract class DBExtract implements Extract {

	@Override
	public int open(String configFile, String configDictionary) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int close() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	@Override
	public int read(List<Object> l) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int read(List<Object> l, int amount) {
		// TODO Auto-generated method stub
		return 0;
	}

}
