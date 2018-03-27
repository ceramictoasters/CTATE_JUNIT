package edu.csbsju.ntc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NewTelephoneCompanyTest_WBT {
	private NewTelephoneCompany ntc;

	@Before
	public void setUp() throws Exception {
		ntc = new NewTelephoneCompany();
	}

	@Test
	public void testGetStartTime() {
		int expResult = 0;
		int result = ntc.getStartTime();
		assertEquals("Start time is " + expResult, expResult, result);
	}

	@Test
	public void testSetStartTime() {
		int expResult = 40;
		ntc.setStartTime(expResult);
		int result = ntc.getStartTime();
		assertEquals("Start time is now " + expResult, expResult, result);
	}

	@Test
	public void testGetDuration() {
		int expResult = 0;
		int result = ntc.getDuration();
		assertEquals("Duration is" + expResult, expResult, result);
	}

	@Test
	public void testSetDuration() {
		int expResult = 40;
		ntc.setDuration(expResult);
		int result = ntc.getDuration();
		assertEquals("Duration is now " + expResult, expResult, result);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void testInvalidStartTime_Case1() {
		ntc.setStartTime(-5);
		ntc.setDuration(10);
		ntc.computeCharge();
	}

	@Test(expected = UnsupportedOperationException.class)
	public void testInvalidStartTime_Case2() {
		ntc.setStartTime(-1);
		ntc.setDuration(10);
		ntc.computeCharge();
	}

	@Test(expected = UnsupportedOperationException.class)
	public void testInvalidStartTime_Case3() {
		ntc.setStartTime(2544);
		ntc.setDuration(10);
		ntc.computeCharge();
	}

	@Test(expected = UnsupportedOperationException.class)
	public void testInvalidStartTime_Case4() {
		ntc.setStartTime(2400);
		ntc.setDuration(10);
		ntc.computeCharge();
	}

	@Test(expected = UnsupportedOperationException.class)
	public void testInvalidStartTime_Case5() {
		ntc.setStartTime(2401);
		ntc.setDuration(10);
		ntc.computeCharge();
	}

	@Test(expected = UnsupportedOperationException.class)
	public void testInvalidStartTime_Case6() {
		ntc.setStartTime(1578);
		ntc.setDuration(10);
		ntc.computeCharge();
	}

	@Test(expected = UnsupportedOperationException.class)
	public void testInvalidStartTime_Case7() {
		ntc.setStartTime(1160);
		ntc.setDuration(10);
		ntc.computeCharge();
	}

	@Test(expected = UnsupportedOperationException.class)
	public void testInvalidStartTime_Case8() {
		ntc.setStartTime(1161);
		ntc.setDuration(10);
		ntc.computeCharge();
	}

	@Test(expected = UnsupportedOperationException.class)
	public void testInvalidStartTime_Case9() {
		ntc.setStartTime(799);
		ntc.setDuration(-5);
		ntc.computeCharge();
	}

	@Test(expected = UnsupportedOperationException.class)
	public void testInvalidDuration_Case1() {
		ntc.setStartTime(1800);
		ntc.setDuration(0);
		ntc.computeCharge();
	}

	@Test(expected = UnsupportedOperationException.class)
	public void testInvalidDuration_Case2() {
		ntc.setStartTime(1800);
		ntc.setDuration(-1);
		ntc.computeCharge();
	}

	@Test
	public void testBothDiscounts_Case1() {
		ntc.setStartTime(500);
		ntc.setDuration(100);
		double expResult = 1768.0;
		assertTrue("A call starting at " + ntc.getStartTime() + " for a duration of " + ntc.getDuration() + expResult,
				expResult == ntc.computeCharge());
	}

	@Test
	public void testBothDiscounts_Case2() {
		ntc.setStartTime(759);
		ntc.setDuration(61);
		double expResult = 1078.48;
		assertTrue("A call starting at " + ntc.getStartTime() + " for a duration of " + ntc.getDuration() + expResult,
				expResult == ntc.computeCharge());
	}

	@Test
	public void testBothDiscounts_Case3() {
		ntc.setStartTime(1959);
		ntc.setDuration(61);
		double expResult = 1078.48;
		assertTrue("A call starting at " + ntc.getStartTime() + " for a duration of " + ntc.getDuration() + expResult,
				expResult == ntc.computeCharge());
	}

	@Test
	public void testBothDiscounts_Case4() {
		ntc.setStartTime(2359);
		ntc.setDuration(65);
		double expResult = 1149.2;
		assertTrue("A call starting at " + ntc.getStartTime() + " for a duration of " + ntc.getDuration() + expResult,
				expResult == ntc.computeCharge());
	}

	@Test
	public void testStarttimeDiscount_Case1() {
		ntc.setStartTime(0);
		ntc.setDuration(60);
		double expResult = 1248.0;
		assertTrue("A call starting at " + ntc.getStartTime() + " for a duration of " + ntc.getDuration() + expResult,
				expResult == ntc.computeCharge());
	}

	@Test
	public void testStarttimeDiscount_Case2() {
		ntc.setStartTime(400);
		ntc.setDuration(59);
		double expResult = 1227.2;
		assertTrue("A call starting at " + ntc.getStartTime() + " for a duration of " + ntc.getDuration() + expResult,
				expResult == ntc.computeCharge());
	}

	@Test
	public void testStarttimeDiscount_Case3() {
		ntc.setStartTime(759);
		ntc.setDuration(1);
		double expResult = 20.8;
		assertTrue("A call starting at " + ntc.getStartTime() + " for a duration of " + ntc.getDuration() + expResult,
				expResult == ntc.computeCharge());
	}

	@Test
	public void testStarttimeDiscount_Case4() {
		ntc.setStartTime(1800);
		ntc.setDuration(10);
		double expResult = 208.0;
		assertTrue("A call starting at " + ntc.getStartTime() + " for a duration of " + ntc.getDuration() + expResult,
				expResult == ntc.computeCharge());
	}

	@Test
	public void testStarttimeDiscount_Case5() {
		ntc.setStartTime(1801);
		ntc.setDuration(10);
		double expResult = 208.0;
		assertTrue("A call starting at " + ntc.getStartTime() + " for a duration of " + ntc.getDuration() + expResult,
				expResult == ntc.computeCharge());
	}

	@Test
	public void testStarttimeDiscount_Case6() {
		ntc.setStartTime(2359);
		ntc.setDuration(10);
		double expResult = 208.0;
		assertTrue("A call starting at " + ntc.getStartTime() + " for a duration of " + ntc.getDuration() + expResult,
				expResult == ntc.computeCharge());
	}

	@Test
	public void testDurationDiscount_Case1() {
		ntc.setStartTime(800);
		ntc.setDuration(65);
		double expResult = 2298.40;
		assertTrue("A call starting at " + ntc.getStartTime() + " for a duration of " + ntc.getDuration() + expResult,
				expResult == ntc.computeCharge());
	}

	@Test
	public void testDurationDiscount_Case2() {
		ntc.setStartTime(900);
		ntc.setDuration(61);
		double expResult = 2156.96;
		assertTrue("A call starting at " + ntc.getStartTime() + " for a duration of " + ntc.getDuration() + expResult,
				expResult == ntc.computeCharge());
	}

	@Test
	public void testCNoDiscounts_Case1() {
		ntc.setStartTime(1000);
		ntc.setDuration(40);
		double expResult = 1664.00;
		assertTrue("A call starting at " + ntc.getStartTime() + " for a duration of " + ntc.getDuration() + expResult,
				expResult == ntc.computeCharge());
	}

	@Test
	public void testCNoDiscounts_Case2() {
		ntc.setStartTime(800);
		ntc.setDuration(1);
		double expResult = 41.60;
		assertTrue("A call starting at " + ntc.getStartTime() + " for a duration of " + ntc.getDuration() + expResult,
				expResult == ntc.computeCharge());
	}

	@Test
	public void testCNoDiscounts_Case3() {
		ntc.setStartTime(801);
		ntc.setDuration(59);
		double expResult = 2454.40;
		assertTrue("A call starting at " + ntc.getStartTime() + " for a duration of " + ntc.getDuration() + expResult,
				expResult == ntc.computeCharge());
	}

	@Test
	public void testCNoDiscounts_Case4() {
		ntc.setStartTime(1759);
		ntc.setDuration(60);
		double expResult = 2496.00;
		assertTrue("A call starting at " + ntc.getStartTime() + " for a duration of " + ntc.getDuration() + expResult,
				expResult == ntc.computeCharge());
	}
}
