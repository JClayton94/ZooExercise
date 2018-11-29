package zooProject;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

	private List<Animal> animals;
	
	private List<Mammal> mammals;
	
	private List<Bird> birds;

	public Zoo(List<Animal> animals) {
		this.animals = animals;
		mammals = new ArrayList<Mammal>();
		birds = new ArrayList<Bird>();
	}

	public void addToAnimalsArray(Animal a) {
		
		animals.add(a);
		
	}
	public List<Animal> getAnimalsArray() {
		
		return animals; 
		
	}
	
	public void sortAnimalsArray() {
		
		animals.stream().filter(a -> a instanceof Mammal).forEach(a -> mammals.add((Mammal) a));
		
		animals.stream().filter(a -> a instanceof Bird).forEach(a -> birds.add((Bird) a));
	}
	
}
