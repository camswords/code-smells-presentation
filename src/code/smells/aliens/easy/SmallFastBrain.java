package code.smells.aliens.easy;

import java.util.ArrayList;
import java.util.List;

public class SmallFastBrain implements Brain {

	private List<String> words = new ArrayList<String>();
	private int size = 1;
	
	@Override
	public boolean canRememberMore() {
		return words.size() < size;
	}

	@Override
	public void remember(String word) {
		words.add(word);
	}

	@Override
	public String regurgitate() {
		String allIKnow = "";

		for (int i = 0; i < size && i < words.size(); i++) {
			allIKnow += " " + words.get(i);
		}
		
		return allIKnow;
	}
}
