package com.oopz.lab5.task1;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MeasurementsTest {
	
	private MeasurementsHolder benchmarkHolder;
	private MeasurementsHolder benchmarkProcessedHolder;
	
	private MeasurementsHolderDAOTextFileImpl inTextDao = new MeasurementsHolderDAOTextFileImpl("in_text.txt");
	private MeasurementsHolderDAOTextFileImpl outTextDao = new MeasurementsHolderDAOTextFileImpl("out_text.txt");
	private MeasurementsHolderDAOBinaryFileImpl inBinDao = new MeasurementsHolderDAOBinaryFileImpl("in_bin.dat");
	private MeasurementsHolderDAOBinaryFileImpl outBinDao = new MeasurementsHolderDAOBinaryFileImpl("out_bin.dat");
	
	@Before
	public void setUp() throws IOException {
		MeasurementsProvider measurementsProvider = new RandomMeasurementsProvider(-50, 50, 100);
		benchmarkHolder = measurementsProvider.getMeasurements();
		
		MeasurementsProcessor measurementsProcessor = new FirstOddAdder(benchmarkHolder);
		benchmarkProcessedHolder = measurementsProcessor.process();
		
		inTextDao.write(benchmarkHolder);
		inBinDao.write(benchmarkHolder);
	}
	
	@After
	public void tearDown() {
		inTextDao.remove();
		inBinDao.remove();
	}
	
	private void testDao(MeasurementsHolderDAO inDao, MeasurementsHolderDAO outDao) throws IOException {
		MeasurementsHolder holder = inDao.restore();
		assertEquals(holder, benchmarkHolder);
		
		MeasurementsProcessor processor = new FirstOddAdder(holder);
		MeasurementsHolder processedHolder = processor.process();
		
		outDao.write(processedHolder);
		assertEquals(outDao.restore(), benchmarkProcessedHolder);
	}
	
	@Test
	public void testInTextDaoOutTextDao() {
		try {
			testDao(inTextDao, outTextDao);
		} catch (IOException e) {
			fail("Catched exception: " + e);
		}
	}
	
	@Test
	public void testInBinDaoOutBinDao() {
		try {
			testDao(inBinDao, outBinDao);
		} catch (IOException e) {
			fail("Catched exception: " + e);
		}
	}
	
	@Test
	public void testInTextDaoOutBinDao() {
		try {
			testDao(inTextDao, outBinDao);
		} catch (IOException e) {
			fail("Catched exception: " + e);
		}
	}
	
	@Test
	public void testInBinDaoOutTextDao() {
		try {
			testDao(inBinDao, outTextDao);
		} catch (IOException e) {
			fail("Catched exception: " + e);
		}
	}
	
	@Test
	public void testInBinDaoSameOutBinDao() {
		try {
			testDao(inBinDao, outBinDao);
		} catch (IOException e) {
			fail("Catched exception: " + e);
		}
	}
}
