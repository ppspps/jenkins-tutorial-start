package com.m.jenkins_tutorial_start.q1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SimpleCalculatrTest {

	@Test
	public void addingTest() {
		assertEquals(3, new SimpleCalculator().adding(1, 2));
	}

}
