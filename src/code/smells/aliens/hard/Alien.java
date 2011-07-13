package code.smells.aliens.hard;

public class Alien extends SmallBrain {
	
	private String word = "";
	
	public Alien() {
		super();
	}

	public void teach(String ... words) {
		for (int i = 0; i < words.length; i++) {
			remember(words[i]);
		}
	}

	@Override
	public String regurgitate() {
		String value = super.regurgitate();
		
		try {
			Thread.sleep(2000);
		} catch(InterruptedException e) {}
		
		return value + " " + word;
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
