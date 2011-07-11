package code.smells.testing.take6;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;

public class HasBalanceMatcher extends BaseMatcher<BankAccount> {

	@Override
	public boolean matches(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void describeTo(Description arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public static Matcher<BankAccount> hasBalance(String amount) {
		return null;
	}

}
