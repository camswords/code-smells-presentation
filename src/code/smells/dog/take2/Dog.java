package code.smells.dog.take2;

public class Dog {

	private final DogLeg frontLeft;
	private final DogLeg frontRight;
	private final DogLeg backLeft;
	private final DogLeg backRight;
	
	public Dog() {
		this.frontLeft = new DogLeg();
		this.frontRight = new DogLeg();
		this.backLeft = new DogLeg();
		this.backRight = new DogLeg();
	}
}
