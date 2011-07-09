package code.smells.dog.take3;

public class Dog {

	private final DogLeg frontLeft;
	private final DogLeg frontRight;
	private final DogLeg backLeft;
	private final DogLeg backRight;
	
	public Dog() {
		this.frontLeft = new MissingDogLeg();
		this.frontRight = new DogLeg();
		this.backLeft = new DogLeg();
		this.backRight = new DogLeg();
	}
}
