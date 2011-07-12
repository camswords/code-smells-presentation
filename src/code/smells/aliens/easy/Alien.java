package code.smells.aliens.easy;

public class Alien {
	
	private CompositeBrain brain;
	
	public Alien() {
		brain = new CompositeBrain(new SmallFastBrain(), new BigSlowBrain());
		brain.remember("umm...");
		brain.remember("nark nark!");
	}
	
	public void teach(String ... words) {
		for (int i = 0; i < words.length; i++) {
			brain.remember(words[i]);
		}
	}
	
	public String speak() {
		return brain.regurgitate();
	}
}
