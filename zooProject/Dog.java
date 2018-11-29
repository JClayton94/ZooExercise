package zooProject;

public class Dog extends Mammal {
	
	private String breed;
	
	public Dog(int age, String breed) {
		super("Canis lupus familiaris", age);
		this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
}
