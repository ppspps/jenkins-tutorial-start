package com.m.jenkins_tutorial_start.q2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AdvancedCalculatorTest {

	@Test
	public void multiplicationTest() {
		assertEquals(5.0, new AdvancedCalculator().multiplication(1.0, 3.0));
	}

}
