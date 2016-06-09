package test.java;


import org.junit.Assert;
import org.junit.Test;

import main.java.HelloWorld;


public class TestHelloWorld {
	HelloWorld hw = new HelloWorld();
	@Test
	public void testHello(){
		System.out.println("Testing testHello..."+System.currentTimeMillis());
		Assert.assertTrue("Hello".equals(hw.Hello()));
	}
}
