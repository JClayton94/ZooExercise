package zooProject;

public abstract class Animal implements MakeNoise{
	
	private String speices;
	private int age;
	private String type;
	
	public Animal(String speices, int age, String type) {
		this.speices = speices;
		this.age = age;
		this.type = type;
	}
	public String getType() {
		return type;
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
