package org.sample;

import static org.testng.Assert.fail;

import org.testng.annotations.Test;

public class SampleTestNG {

	@Test(priority=-2)
	public void test1() {
		System.out.println("test1");
	}

	@Test(enabled=false)
	public void test2() {
		System.out.println("test2");

	}

	@Test
	public void test45() {
		System.out.println("ejafgjDGBBBBBBBVefdbsj");
		System.out.println("ejafgjDGBBBBBBBVefdbsj");
		System.out.println("ejafgjDGBBBBBBBVefdbsj");
		System.out.println("ejafgjDGBBBBBBBVefdbsj");
		System.out.println("ejafgjDGBBBBBBBVefdbsj");
		

	}
	
	
	@Test(priority=-1)
	public void test3() {
		System.out.println("test3");

	}

}
