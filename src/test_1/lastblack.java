package test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class lastblack {

	@Before
	public void setUp() throws Exception {
	}
	
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws Exception {
		assertEquals("5*x-4*y+4*y^2*zoo^50-1*x^2-3*zoo*x^3*y",operational_control.cont(" 0-0*x+1*x-x*2+	2*x+3*x-5*x+y+y*zoo^50*y-5y+3x2-x^2+3*y^2*zoo^50-3*zoo*x*x*y*x ",""));
		assertEquals("",operational_control.cont("-x",""));
		assertEquals("",operational_control.cont("@x",""));
		assertEquals("",operational_control.cont("^x",""));
		assertEquals("",operational_control.cont("x+xin",""));
		assertEquals("",operational_control.cont("x+-y",""));
		assertEquals("",operational_control.cont("x+ ",""));
		assertEquals("",operational_control.cont("x^y+5*y",""));
		assertEquals("",operational_control.cont("",""));
		
	}

}
