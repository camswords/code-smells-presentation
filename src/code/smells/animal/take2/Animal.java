package code.smells.animal.take2;

//job: responsible for moving an animal through 
//	   the air, water, or on land.
public class Animal {

	private MovementStyle movementStyle;
	
	public Animal(int legs, boolean canFly, boolean canSwim) {
		if (canFly) {
			this.movementStyle = new FlyingMovementStyle();
		} else if (canSwim) {
			this.movementStyle = new SwimmingMovementStyle();
		} else {
			this.movementStyle = new WalkingMovementStyle(legs);
		}
	}
	
	public String move() {
		return movementStyle.move();
	}
}
