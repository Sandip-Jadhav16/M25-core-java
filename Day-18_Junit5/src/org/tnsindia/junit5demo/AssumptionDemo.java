package org.tnsindia.junit5demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

class AssumptionDemo {

	@Test
	void display()
	{
		System.setProperty("Sandip", "Jadhav");
		//will evaluate the given assumption and if it results in true then the given test is allowed to execute 
		Assumptions.assumeTrue("Jadhav".equals(System.getProperty("Sandip")));
	}
	@Test
	void display1()
	{
		System.setProperty("Sandip", "Jadhav");
		//Will evaluate the given assumption and test will run if result is false.
		Assumptions.assumeFalse("Jadh".equals(System.getProperty("Sandip")));
	}

}
