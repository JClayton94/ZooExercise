package zooProject;

public abstract class Bird extends Animal {

	private int wingSpan;

	public Bird(String speices, int age, int wingSpan, String type) {
		super(speices, age, type);
		this.wingSpan = wingSpan;
	}

	public int getWingSpan() {
		return wingSpan;
	}

	public void setWingSpan(int wingSpan) {
		this.wingSpan = wingSpan;
	}

}
