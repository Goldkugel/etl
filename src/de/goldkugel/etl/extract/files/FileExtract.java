package de.goldkugel.etl.extract.files;

import java.io.File;

import de.goldkugel.etl.extract.basic.Extract;

/**
 * 
 * @author Peter Pallaoro
 *
 */
public abstract class FileExtract implements Extract {
	
	//
	protected File file = null;

	/**
	 * 
	 */
	public FileExtract() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @param name
	 * @return
	 */
	public int openFile(String name) {
		
		return 0;
	}
	
	/**
	 * 
	 * @return
	 */
	public int closeFile() {
		
		return 0;
	}
}
