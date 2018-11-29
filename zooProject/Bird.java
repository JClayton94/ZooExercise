package zooProject;

public abstract class Bird extends Animal {
	
	private int wingSpan;

	public Bird(String speices, int age, int wingSpan) {
		super(speices, age);
		this.wingSpan = wingSpan;
	}

	

}
