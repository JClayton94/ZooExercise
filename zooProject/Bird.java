package zooProject;

public abstract class Bird extends Animal {
	
	private int wingSpan;

	public Bird(String speices, int age, int wingSpan) {
		super(speices, age);
		this.wingSpan = wingSpan;
	}

	public int getWingSpan() {
		return wingSpan;
	}

	public void setWingSpan(int wingSpan) {
		this.wingSpan = wingSpan;
	}

}
