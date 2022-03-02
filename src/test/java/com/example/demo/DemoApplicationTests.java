package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void sum() {
		int sum = 2+2;
		assertEquals(4, sum);
	}

	@Test
	void product() {
		int product = 2*2;
		assertEquals(4, product);
	}

}
