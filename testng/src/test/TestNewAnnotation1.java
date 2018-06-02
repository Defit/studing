package test;

import org.testng.annotations.Test;

import fwk.NewAnnotation;

public class TestNewAnnotation1 {

	@Test
	@NewAnnotation("first")
	public void test1_n() {
		System.out.println("Test FIRST");
	}
}
