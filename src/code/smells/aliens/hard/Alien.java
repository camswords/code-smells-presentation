package code.smells.aliens.hard;

public class Alien extends SmallBrain {
	
	private String word = "";
	
	public Alien() {
		super("umm...", "nark nark!");
	}

	public void teach(String ... words) {
		for (int i = 0; i < words.length; i++) {
			remember(words[i]);
		}
	}

	@Override
	public String regurgitate() {
		return super.regurgitate() + " " + word;
	}

	@Override
	public void remember(String word) {
		if (super.canRememberMore()) {
			super.remember(word);
		} else {
			this.word += word + " ";
		}
	}
	
	public String speak() {
		return regurgitate();
	}
}
