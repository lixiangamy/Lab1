package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class myTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testExpression() {
		assertEquals("5*x-4*y+4*y^2*zoo^50-x^2-3*zoo*x^3*y",myjavahello.expression(" 0-0*x+1*x-x*2+	2*x+3*x-5*x+y+y*zoo^50*y-5y+3x2-x^2+3*y^2*zoo^50-3*zoo*x*x*y*x ",""));
		
		assertEquals("",myjavahello.expression("-x",""));
		assertEquals("",myjavahello.expression("@x",""));
		assertEquals("",myjavahello.expression("^x",""));
		assertEquals("",myjavahello.expression("x+xin",""));
		assertEquals("",myjavahello.expression("x+-y",""));
		assertEquals("",myjavahello.expression("x+ ",""));
		assertEquals("",myjavahello.expression("x^y+5*y",""));
		
		assertEquals("",myjavahello.expression("",""));
	}

}
