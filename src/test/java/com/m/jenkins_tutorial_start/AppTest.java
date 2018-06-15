package com.m.jenkins_tutorial_start;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class AppTest {

	@Test
	public void test() {
		assertEquals("Hi", new App().message());
	}
	
	@Test
	public void returnIntTest() {
		assertEquals(1, new App().returnInt());
	}
	
	@Test
	public void returnBooleanTest() {
		assertEquals(true, new App().returnBoolean());
	}
	
	@Test
	@Ignore
	public void returnBooleanTestFail() {
		assertEquals(false, new App().returnBoolean());
	}

}
