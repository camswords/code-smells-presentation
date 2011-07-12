package code.smells.understanding.aliens;


public class CompositeBrain {

	private final Brain firstBrain;
	private final Brain secondBrain;

	public CompositeBrain(Brain firstBrain, Brain secondBrain) {
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
