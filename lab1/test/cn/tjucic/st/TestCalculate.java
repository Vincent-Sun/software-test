package cn.tjucic.st;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestCalculate {
	Calculate cal;
	@Before
	public void setUp() {
		cal = new Calculate();
	}
	@Test
	public void testAdd(){
		
		assertEquals(5,cal.add(2, 3));
	}
	@Test
	public void testSubstract() {
		assertEquals(5,cal.substract(8,3));
	}
	@Test(expected = ArithmeticException.class)
	public void testDivide() {
		assertEquals(2,cal.divide(2, 0));
	}
	@Test(timeout=300)
	public void testTimeout() {
		try {
			Thread.sleep(200);
		}
		catch(InterruptedException e){
			e.printStackTrace();		
		}
	}

}
