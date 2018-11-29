package zooProject;

public abstract class Animal {
	
	private String speices;
	private int age;
	
	public Animal(String speices, int age) {
		this.speices = speices;
		this.age = age;
	}
	public String getSpeices() {
		return speices;
	}
	public void setSpeices(String speices) {
		this.speices = speices;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
