package com.birla;

import org.testng.annotations.Test;

public class TestAnnonation1 {

	@Test  //   define annotation before method   or Test method or Test annontatin method or Test case
	public void testA() // normal java method
	{
		System.out.println("stmt-1 from testA()");
		System.out.println("stmt-2 from testA()");
	}
	
	@Test  //   define annotation before method   or Test method or Test annontatin method or Test case
	public void testA2() // normal java method
	{
		System.out.println("stmt-1 from testA2()");
		System.out.println("stmt-2 from testA2()");
	}
	
}
