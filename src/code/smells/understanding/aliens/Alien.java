package code.smells.understanding.aliens;

public class Alien {
	
	private CompositeBrain brain = new CompositeBrain(new BigBrain(), new ConfusedBrain());
	
	public void teach(String ... words) {
		for (int i = 0; i < words.length; i++) {
			brain.remember(words[i]);
		}
	}
	
	public String speak() {
		return brain.regurgitate();
	}
}
