package com.oopz.lab5.task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class MeasurementsHolderDAOTextFileImpl extends MeasurementsHolderDAOFile {
	
	public MeasurementsHolderDAOTextFileImpl(String fileName) {
		super(fileName);
	}

	@Override
	public void write(MeasurementsHolder holder) throws IOException {
		PrintWriter pos = new PrintWriter(new FileWriter(getFile()));
		try {
			for (int i = 0; i < holder.getSize(); i++) 
				pos.println(holder.getValue(i));
		} finally {
			pos.close();
		}
	}

	@Override
	public MeasurementsHolder restore() throws IOException {
		ArrayList<Integer> values = new ArrayList<Integer>();
		
		BufferedReader reader = new BufferedReader(new FileReader(getFile()));
		try {
			String line;
			while ((line = reader.readLine()) != null)
				values.add(Integer.parseInt(line.trim()));
		} finally {
			reader.close();
		}
		
		MeasurementsHolder holder = new MeasurementsHolder(values.size());
		
		for (int i = 0; i < values.size(); i++) 
			holder.setValue(i, values.get(i));
		
		return holder;
	}

}
