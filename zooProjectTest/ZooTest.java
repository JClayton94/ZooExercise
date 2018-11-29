package zooProjectTest;

import static org.junit.Assert.*;

import org.junit.*;

import zooProject.*;

public class ZooTest {

	@Test
	public void testGetSpeices() {

		Dog test = new Dog(5, "Labrador");

		assertEquals("Not correct spieces", "Canis lupus familiaris" ,test.getSpeices());

	}
	@Test
	public void testGetAge() {

		Dog test = new Dog(5, "Labrador");

		assertEquals("Not correct age", 5 ,test.getAge());

	}


}

