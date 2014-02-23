package com.oopz.lab5.task1;

import java.io.IOException;

public class Task1Test {
	
	private static MeasurementsHolder benchmarkHolder;
	private static MeasurementsHolder benchmarkProcessedHolder;
	
	private static MeasurementsHolderDAOTextFileImpl inTextDao = new MeasurementsHolderDAOTextFileImpl("in_text.txt");
	private static MeasurementsHolderDAOTextFileImpl outTextDao = new MeasurementsHolderDAOTextFileImpl("out_text.txt");
	private static MeasurementsHolderDAOBinaryFileImpl inBinDao = new MeasurementsHolderDAOBinaryFileImpl("in_bin.dat");
	private static MeasurementsHolderDAOBinaryFileImpl outBinDao = new MeasurementsHolderDAOBinaryFileImpl("out_bin.dat");
	
	private static void runTask(MeasurementsHolderDAO inDao, MeasurementsHolderDAO outDao) throws IOException {
		MeasurementsHolder holder = inDao.restore();
		
		if (!holder.equals(benchmarkHolder)) throw new RuntimeException("Wrong holder");
		
		MeasurementsHolder processedHolder = holder.process();
		outDao.write(processedHolder);
		
		if (!outDao.restore().equals(benchmarkProcessedHolder)) throw new RuntimeException("Wrong processed holder");
	}
	
	private static void init() throws IOException {
		benchmarkHolder = new MeasurementsHolder(100);
		benchmarkHolder.initMeasurements(-50, 50);
		
		benchmarkProcessedHolder = benchmarkHolder.process();
		
		inTextDao.write(benchmarkHolder);
		inBinDao.write(benchmarkHolder);
	}
	
	public static void main(String[] args) throws IOException {
		init();
		
		// text --> text
		runTask(inTextDao, outTextDao);
		
		// bin --> bin
		runTask(inBinDao, outBinDao);
		
		// text --> bin
		runTask(inTextDao, outBinDao);
		
		// bin --> text
		runTask(inBinDao, outTextDao);
		
		// bin --> same bin
		runTask(inBinDao, inBinDao);
	}
}
