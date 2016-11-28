package test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class whitetest {

	@Before
	public void setUp() throws Exception {
	}
	
	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void test() throws IOException {
		assertEquals("1*x+1*y",operational_control.cont("x+y",""));
		assertEquals("1",operational_control.cont("!d/d x","x+y"));
		assertEquals("x+y",operational_control.cont("!simplify x=1 y=-1","x+y"));
		assertEquals("",operational_control.cont("-5*x^2+x*y+2*x*y^2+y*zoo^20-5*x",""));
		assertEquals("5*x^2-1*x*y+2*x*y^2+1*y*zoo^20-5*x",operational_control.cont("5*x^2-x*y+2*x*y^2+y*zoo^20-5*x",""));
		assertEquals("-10*x+y+2*y^2-5",operational_control.cont("!d/d x","-5*x^2+x*y+2*x*y^2+y*zoo^20-5*x"));
		assertEquals("20*y*zoo^19",operational_control.cont("!d/d zoo","x*y+y*zoo^20"));
		assertEquals("1*x",operational_control.cont("x",""));
		assertEquals("1",operational_control.cont("!d/d x","x"));
		assertEquals("x",operational_control.cont("!simplify x=2.75","x"));
		assertEquals("2*x+30*x^4-4*x^3",operational_control.cont("!d/d x","x^2+6*x^5-x^4"));
		assertEquals("x+3*y^2*x+100*y",operational_control.cont("!simplify x=0 y=0","x+3*y^2*x+100*y"));
		assertEquals("",operational_control.cont("-x",""));
		assertEquals("",operational_control.cont("@x",""));
		assertEquals("a",operational_control.cont("!d/d @x","a"));
		assertEquals("",operational_control.cont("^x",""));
		assertEquals("",operational_control.cont("x+xin",""));
		assertEquals("",operational_control.cont("x+-y",""));
		assertEquals("",operational_control.cont("x+ ",""));
		assertEquals("",operational_control.cont("x^y+5*y",""));
		assertEquals("",operational_control.cont("",""));
		assertEquals("",operational_control.cont("!d/d ",""));
		assertEquals("a",operational_control.cont("!d/d ","a"));
		assertEquals("x",operational_control.cont("!d/d z","x"));
		assertEquals("",operational_control.cont("!simplify ",""));
		assertEquals("a",operational_control.cont("!simplify ","a"));
		assertEquals("",operational_control.cont("!simplify  = ",""));
		assertEquals("a",operational_control.cont("!simplify a@=$","a"));
		assertEquals("s",operational_control.cont("!simplify z=1","s"));
		assertEquals("5*x-4*y+4*y^2*zoo^50-1*x^2-3*zoo*x^3*y",operational_control.cont(" 0-0*x+1*x-x*2+	2*x+3*x-5*x+y+y*zoo^50*y-5y+3x2-x^2+3*y^2*zoo^50-3*zoo*x*x*y*x ",""));
		assertEquals("2*x-y-2*x",operational_control.cont("!simplify x=10 y=0.75","2*x-y-2*x"));
		assertEquals("2*x-3*x-5*x",operational_control.cont("!simplify x=10","2*x-3*x-5*x"));
		assertEquals("x^2+3*x^3",operational_control.cont("!simplify x=10","x^2+3*x^3"));
		assertEquals("-4*x",operational_control.cont("!simplify x=1.2","-4*x"));
		assertEquals("x+5*z",operational_control.cont("!simplify x=1.23","x+5*z"));
		assertEquals("z+x^21",operational_control.cont("!simplify x=1","z+x^21"));
		assertEquals("x^2+x*z",operational_control.cont("!simplify z=1","x^2+x*z"));
		assertEquals("x^2+x*z",operational_control.cont("!simplify z=30","x^2+x*z"));
		assertEquals("x*z+y*k+kk*x*w+zz*y*q+2*r*y*o",operational_control.cont("!simplify x=1 y=4","x*z+y*k+kk*x*w+zz*y*q+2*r*y*o"));
		assertEquals("y*x^2*z",operational_control.cont("!simplify x=3","y*x^2*z"));
		assertEquals("1",operational_control.cont("!d/d x","x-y+z"));
		assertEquals("-1",operational_control.cont("!d/d x","-x"));
		assertEquals("6*x^4*y+10*x^2",operational_control.cont("x^2*2*y*x^2+x^2+2*x^3*2*y*x+4*x^2*2+x*x",""));

	}

}
