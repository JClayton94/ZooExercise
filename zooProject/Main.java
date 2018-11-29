package zooProject;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Animal> animals = new ArrayList<Animal>();
		
		animals.add(new Dog(5, "poodle"));
		animals.add(new Penguin(10, 20));
		animals.add(new Hawk(5, 30));
		animals.add(new Cat(5));

		Zoo zoo = new Zoo(animals);
		
		zoo.sortAnimalsArray();
		
		zoo.getMammals().stream().forEach(a -> System.out.println(a.getType() + " goes " + a.makeNoise()));
		zoo.getBirds().stream().forEach(a -> System.out.println(a.getType() + " goes " + a.makeNoise()));
		
		
	}
}
