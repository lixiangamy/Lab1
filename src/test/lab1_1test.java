package test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class lab1_1test {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testcont() throws IOException {
		
		assertEquals("5*x-4*y+4*y^2*zoo^50-1*x^2-3*zoo*x^3*y",operational_control.cont(" 0-0*x+1*x-x*2+	2*x+3*x-5*x+y+y*zoo^50*y-5y+3x2-x^2+3*y^2*zoo^50-3*zoo*x*x*y*x ",""));
		assertEquals("200*y^2*zoo^49-3*x^3*y",operational_control.cont("!d/d zoo","5*x-4*y+4*y^2*zoo^50-1*x^2-3*zoo*x^3*y"));
		assertEquals("-9*x^2*y",operational_control.cont("!d/d x","200*y^2*zoo^49-3*x^3*y"));
		assertEquals("-9*x^2*y",operational_control.cont("!simplify x=2.5 y=10","-9*x^2*y"));
		assertEquals("-18*x*y",operational_control.cont("!d/d x","-9*x^2*y"));
		assertEquals("5",operational_control.cont("3+2",""));
		assertEquals("5",operational_control.cont("!d/d x","5"));
		assertEquals("5",operational_control.cont("!simplify z=1","5"));
		assertEquals("2*x^2-8*y",operational_control.cont("!simplify x=2 y=1","2*x^2-8*y"));
		assertEquals("1",operational_control.cont("!d/d x","x"));
		assertEquals("x",operational_control.cont("!simplify x=1","x"));
		assertEquals("",operational_control.cont("-x",""));
		assertEquals("",operational_control.cont("@x",""));
		assertEquals("",operational_control.cont("^x",""));
		assertEquals("",operational_control.cont("x+xin",""));
		assertEquals("",operational_control.cont("x+-y",""));
		assertEquals("",operational_control.cont("x+ ",""));
		assertEquals("",operational_control.cont("x^y+5*y",""));
		assertEquals("",operational_control.cont("",""));
		assertEquals("",operational_control.cont("!d/d ",""));
		assertEquals("",operational_control.cont("!simplify ",""));
		assertEquals("x+y",operational_control.cont("!simplify ","x+y"));
		assertEquals("0",operational_control.cont("0",""));
		
	}

}
