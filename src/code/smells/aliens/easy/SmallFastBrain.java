package code.smells.aliens.easy;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;

public class SmallFastBrain implements Brain {

	private static final int MAX_MEMORY_SIZE = 1;
	private final List<String> memory;
	
	public SmallFastBrain() {
		this.memory = new ArrayList<String>();
	}

	public boolean canRememberMore() {
		return memory.size() < MAX_MEMORY_SIZE;
	}

	public void remember(String word) {
		if (canRememberMore()) {
			memory.add(word);
		}
	}

	public String regurgitate() {
		return StringUtils.join(memory, " ");
	}
}
