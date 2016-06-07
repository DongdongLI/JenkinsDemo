package test;


import org.junit.Assert;
import org.junit.Test;

import hello.HelloWorld;

public class TestHelloWorld {
	HelloWorld hw = new HelloWorld();
	@Test
	public void testHello(){
		Assert.assertTrue("Hello".equals(hw.Hello()));
	}
}
