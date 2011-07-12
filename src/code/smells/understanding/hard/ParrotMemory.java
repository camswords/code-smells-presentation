package code.smells.understanding.hard;

public class ParrotMemory implements Memory {

	private final Memory birdMemory = new BirdMemory();
	
	@Override
	public String[] recall() {
		return null;
	}

	@Override
	public void remember(String word) {
	}
}
