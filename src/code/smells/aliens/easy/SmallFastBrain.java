package code.smells.aliens.easy;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;

public class SmallFastBrain implements Brain {

	private final List<String> memory;
	private final int size;
	
	public SmallFastBrain(int size) {
		this.memory = new ArrayList<String>();
		this.size = size;
	}

	@Override
	public boolean canRememberMore() {
		return memory.size() < size;
	}

	@Override
	public void remember(String word) {
		if (canRememberMore()) {
			memory.add(word);
		}
	}

	@Override
	public String regurgitate() {
		return StringUtils.join(memory, " ");
	}
}
