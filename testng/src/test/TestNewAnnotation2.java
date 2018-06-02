package test;

import org.testng.annotations.Test;

import fwk.NewAnnotation;

public class TestNewAnnotation2 {

	@Test
	@NewAnnotation("third")
	public void test3_n() {
		System.out.println("Test THIRD");
	}
}
