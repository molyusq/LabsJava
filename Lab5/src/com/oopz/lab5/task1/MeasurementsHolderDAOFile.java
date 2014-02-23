package com.oopz.lab5.task1;

import java.io.File;

public abstract class MeasurementsHolderDAOFile implements
		MeasurementsHolderDAO {
	
	private File file;
	
	public MeasurementsHolderDAOFile(String fileName) {
		file = new File(fileName);
	}
	
	public boolean exists() {
		return file.exists();
	}
	
	public File getFile() {
		return file;
	}
}