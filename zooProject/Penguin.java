package zooProject;

public class Penguin extends Bird {

	public Penguin(int age, int wingSpan) {
		super("Aptenodytes forsteri", age, wingSpan, "Penguin");
	}
	
public String makeNoise() {
		
		return "Bwap!";
		
	}

}
