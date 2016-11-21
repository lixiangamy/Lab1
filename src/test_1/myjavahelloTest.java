package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class myjavahelloTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDerivative() {
		assertEquals("x+y",myjavahello.derivative("x+y",""));
		assertEquals("x+y+x*y",myjavahello.derivative("x+y+x*y","Z12;0"));
		assertEquals("x+y",myjavahello.derivative("x+y","z"));
		assertEquals("-10*x+y+2*y^2-5",myjavahello.derivative("-5*x^2+x*y+2*x*y^2+y*zoo^20-5*x","x"));
		assertEquals("20*y*zoo^19",myjavahello.derivative("x*y+y*zoo^20","zoo"));
		assertEquals("1",myjavahello.derivative("x","x"));
		assertEquals("2*x+30*x^4-4*x^3",myjavahello.derivative("x^2+6*x^5-x^4","x"));
		
	}
}
