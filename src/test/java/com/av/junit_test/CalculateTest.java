package com.av.junit_test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculateTest {
	Calculator calculator=null;
	@Before
	public void setup()
	{
		calculator=new Calculator();
	}
	@Test
	public void test() {
		
		assertEquals(15, calculator.add(5, 10));
		assertEquals(5, calculator.add(-5, 10));
		assertEquals(0, calculator.add(0, 0));
		
	}

}
