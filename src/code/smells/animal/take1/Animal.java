package code.smells.animal.take1;

//job: responsible for moving an animal through 
//     the air, water, or on land.
public class Animal {

	private final int legs;
	private final boolean canFly;
	private final boolean canSwim;
	
	public Animal(int legs, boolean canFly, boolean canSwim) {
		this.legs = legs;
		this.canFly = canFly;
		this.canSwim = canSwim;
	}
	
	public String move() {
		if (canFly) {
			return "flying!...";
		} else if (canSwim) {
			return "swimming!...";
		}
		return "moving all of my " + legs + "legs!...";
	}
}
