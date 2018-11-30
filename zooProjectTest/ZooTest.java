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
	public void testArraySortMammals() {

		List<Animal> testArray = new ArrayList<Animal>();

		Zoo zooTest = new Zoo(testArray);

		zooTest.addToAnimalsArray(new Dog(5, "poodle"));
		zooTest.addToAnimalsArray(new Penguin(10, 20));
		zooTest.addToAnimalsArray(new Hawk(5, 30));
		zooTest.addToAnimalsArray(new Cat(5));

		zooTest.sortAnimalsArray();

		assertTrue("Not sorted correctly", zooTest.getMammals().get(0) instanceof Mammal);
	}
	@Test 
	public void testMakeNoise() {
		
		List<Animal> testArray = new ArrayList<Animal>();

		Zoo zooTest = new Zoo(testArray);
		
		zooTest.addToAnimalsArray(new Cat(5));
		zooTest.addToAnimalsArray(new Dog(5, "poodle"));
		zooTest.addToAnimalsArray(new Penguin(10, 20));
		zooTest.addToAnimalsArray(new Hawk(5, 30));
		
		assertEquals("Not correct noise", "Meow!", zooTest.getAnimalsArray().get(0).makeNoise());
		assertEquals("Not correct noise", "Woof!", zooTest.getAnimalsArray().get(1).makeNoise());
		assertEquals("Not correct noise", "Bwap!", zooTest.getAnimalsArray().get(2).makeNoise());
		assertEquals("Not correct noise", "CAW!", zooTest.getAnimalsArray().get(3).makeNoise());
	}
}



