package test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class lastwhite {

	@Before
	public void setUp() throws Exception {
	}
	
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws Exception {
		assertEquals("1*x+1*y",operational_control.cont("x+y",""));
		assertEquals("x+y",operational_control.cont("!d/d z","x+y"));
		assertEquals("-10*x+y+2*y^2-5",operational_control.cont("!d/d x","-5*x^2+x*y+2*x*y^2+y*zoo^20-5*x"));
		assertEquals("20*y*zoo^19",operational_control.cont("!d/d zoo","x*y+y*zoo^20"));
		assertEquals("1",operational_control.cont("!d/d x","x"));
		assertEquals("2*x+30*x^4-4*x^3",operational_control.cont("!d/d x","x^2+6*x^5-x^4"));
	}

}
