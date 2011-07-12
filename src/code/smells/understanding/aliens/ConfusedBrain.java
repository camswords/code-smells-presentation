package code.smells.understanding.aliens;

public class ConfusedBrain implements Brain {

	private String word = "ummm...";
	
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
		this.word += " " + word;
	}

}
