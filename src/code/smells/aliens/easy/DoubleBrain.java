package code.smells.aliens.easy;


public class DoubleBrain {

	private final Brain firstBrain;
	private final Brain secondBrain;

	public DoubleBrain(Brain firstBrain, Brain secondBrain) {
		this.firstBrain = firstBrain;
		this.secondBrain = secondBrain;
	}

	public void remember(String word) {
		if (firstBrain.canRememberMore()) {
			firstBrain.remember(word);
		} else {
			secondBrain.remember(word);
		}
	}

	public String regurgitate() {
		return firstBrain.regurgitate() + " " + secondBrain.regurgitate();
	}

}
