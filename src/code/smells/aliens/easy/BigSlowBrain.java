package code.smells.aliens.easy;

import java.util.concurrent.TimeUnit;

public class BigSlowBrain implements Brain {

	private String memory = "";
	
	@Override
	public boolean canRememberMore() {
		return true;
	}

	@Override
	public String regurgitate() {
		try { 
			TimeUnit.SECONDS.sleep(2);
		} catch(InterruptedException e) {}
		
		return memory;
	}

	@Override
	public void remember(String word) {
		this.memory += word + " ";
	}
}
