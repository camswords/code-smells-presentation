package code.smells.testing.take2;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {
	
	private BankAccount account;
	
	@Before
	public void setup() {
		account = new BankAccount(202626, 12345678, new BigDecimal("100.00"));
	}
	
	@Test
	public void shouldRemoveMoneyFromAccountOnWithdraw() {
		account.withdraw(new BigDecimal("50.00"));
		assertThat(account.getBalance(), equalTo(new BigDecimal("50.00")));
	}
	
	@Test
	public void shouldAddMoneyToAccountOnDeposit() {
		account.deposit(new BigDecimal("10.00"));
		assertThat(account.getBalance(), equalTo(new BigDecimal("110.00")));
	}
}
