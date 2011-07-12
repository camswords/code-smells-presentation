package code.smells.understanding.aliens;

import java.util.ArrayList;
import java.util.List;

public class BigBrain implements Brain {

	private List<String> words = new ArrayList<String>();
	private int size = 4;
	
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
			allIKnow += words.get(i) + " ";
		}
		
		return allIKnow;
	}
}
