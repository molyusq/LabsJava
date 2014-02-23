package com.oopz.lab5.task1;

import java.io.IOException;

public abstract interface MeasurementsHolderDAO {
	void write(MeasurementsHolder holder) throws IOException;
	MeasurementsHolder restore() throws IOException;
}
