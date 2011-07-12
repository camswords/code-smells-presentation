package code.smells.animal.take3;

public interface Animal {
	
	String move();
}

// job: responsible for moving a bird through the air
class Bird implements Animal {
	public String move() {
		return "flying!...";
	}
}

// job: responsible for moving a fish through the water
class Fish implements Animal {
	public String move() {
		return "swimming!...";
	}
}