package com.oopz.lab5.task1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class MeasurementsHolderDAOBinaryFileImpl extends MeasurementsHolderDAOFile {
	
	public MeasurementsHolderDAOBinaryFileImpl(String fileName) {
		super(fileName);
	}

	@Override
	public void write(MeasurementsHolder holder) throws IOException {
		DataOutputStream dos = new DataOutputStream(new FileOutputStream(getFile()));
		try {
			for (int i = 0; i < holder.getSize(); i++) 
				dos.writeInt(holder.getValue(i));
		} finally {
			dos.close();
		}
	}

	@Override
	public MeasurementsHolder restore() throws IOException {
		ArrayList<Integer> values = new ArrayList<Integer>();
		
		DataInputStream dis = new DataInputStream(new FileInputStream(getFile()));
		try {
			while(dis.available() >= 4)
				values.add(dis.readInt());
		} finally {
			dis.close();
		}
		
		MeasurementsHolder holder = new MeasurementsHolder(values.size());
		
		for (int i = 0; i < values.size(); i++)
			holder.setValue(i, values.get(i));
		
		return holder;
	}

}
