package code.smells.aliens.easy;

public class Alien {
	
	private DoubleBrain brain = new DoubleBrain(new SmallFastBrain(), new BigSlowBrain());
	
	public void teach(String ... words) {
		for (int i = 0; i < words.length; i++) {
			brain.remember(words[i]);
		}
	}
	
	public String speak() {
		return brain.regurgitate();
	}
}
