package test;

import org.testng.annotations.Test;

import fwk.NewAnnotation;

public class TestNewAnnotation3 {

	@Test
	@NewAnnotation("second")
	public void test2_1_n() {
		System.out.println("Test SECOND 1");
	}
	
	@Test
	@NewAnnotation("second")
	public void test2_2_n() {
		System.out.println("Test SECOND 2");
	}
}
