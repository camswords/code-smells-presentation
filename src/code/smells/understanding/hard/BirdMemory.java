package code.smells.understanding.hard;

import java.util.Arrays;
import java.util.List;

public class BirdMemory implements Memory {

	private AnimalMemory animalMemory = new AnimalMemory();
	private String extraMemory = "";
	
	@Override
	public String[] recall() {
		List<String> words = Arrays.asList(animalMemory.recall());
		words.add(extraMemory);
		return (String[]) words.toArray();
	}

	@Override
	public void remember(String word) {
	}

}
