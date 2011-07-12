package code.smells.aliens.easy;

public class BigSlowBrain implements Brain {

	private String word = "";
	
	@Override
	public boolean canRememberMore() {
		return true;
	}

	@Override
	public String regurgitate() {
		return word;
	}

	@Override
	public void remember(String word) {
		this.word += word + " ";
	}
}
