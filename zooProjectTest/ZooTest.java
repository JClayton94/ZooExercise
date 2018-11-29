package zooProjectTest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;

import zooProject.*;

public class ZooTest {

	@Test
	public void testGetSpeices() { 

		Dog test = new Dog(5, "Poodle");
		test.setSpeices("Canis lupus familiaris");
		assertEquals("Not correct spieces", "Canis lupus familiaris" ,test.getSpeices());

	}
	@Test
	public void testGetAge() {

		Dog test = new Dog(5, "Labrador");
		test.setAge(7);
		assertEquals("Not correct age", 7 ,test.getAge());

	}
	@Test
	public void testAddToAnimalArray() {

		List<Animal> testArray = new ArrayList<Animal>();

		Zoo zooTest = new Zoo(testArray);

		zooTest.addToAnimalsArray(new Dog(5, "poodle"));

		assertEquals("Not added to array properly", 5, zooTest.getAnimalsArray().get(0).getAge());
	}

	@Test
	public void testArraySort() {
		
		List<Animal> testArray = new ArrayList<Animal>();

		Zoo zooTest = new Zoo(testArray);

		zooTest.addToAnimalsArray(new Dog(5, "poodle"));
		zooTest.addToAnimalsArray(new Penguin(10, 20));
		zooTest.addToAnimalsArray(new Hawk(5, 30));
		zooTest.addToAnimalsArray(new Cat(5));

		
	}
}

