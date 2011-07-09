package code.smells.dog.take1;

import java.util.List;

public class Dog {

	private final List<DogLeg> legs;
	
	public Dog() {
		this.legs = Lists.create(new DogLeg(), new DogLeg(), new DogLeg(), new DogLeg());
	}
}
