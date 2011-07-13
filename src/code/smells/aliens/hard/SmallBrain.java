package code.smells.aliens.hard;

import java.util.ArrayList;
import java.util.List;

public class SmallBrain {

	private List<String> words = new ArrayList<String>();
	private final int size = 1;
	
	public SmallBrain(String ... words) {
		for (int i = 0; i < words.length; i++) {
			remember(words[i]);
		}
	}

	public boolean canRememberMore() {
		return words.size() < size;
	}

	public void remember(String word) {
		words.add(word);
	}

	public String regurgitate() {
		String allIKnow = "";

		for (int i = 0; i < size && i < words.size(); i++) {
			allIKnow += " " + words.get(i);
		}
		
		return allIKnow;
	}
}
