package com.ecommerce.Phase3_NestedTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

class Testing {
	Authentication auth=new Authentication();
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("beforeAll");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("afterAll");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("beforeEach");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("afterEach");
	}

	void test() {
		assertTrue(auth.validate("Aish","Aish"));
		System.out.println("true called");
	}
	
	void test1() {
		assertFalse(auth.validate("Aish","Aish123"));
		System.out.println("false called");
	}
	

}
