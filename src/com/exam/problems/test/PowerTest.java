package com.exam.problems.test;
import static org.junit.Assert.assertEquals;
import com.exam.problems.*;

import org.junit.Test;

public class PowerTest {

	@Test
	public void test0To0thPower()
	{
		assertEquals(1, Power.pow(0, 0));
	}
	
	@Test
	public void test0To5thPower()
	{
		assertEquals(1, Power.pow(0, 5));
	}
}
