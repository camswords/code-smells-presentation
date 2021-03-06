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
		//given
		account = new BankAccount(202626, 12345678, new BigDecimal("100.00"));
	}
	
	@Test
	public void shouldRemoveMoneyFromAccountOnWithdraw() {
		//when
		account.withdraw(new BigDecimal("50.00"));
		//then
		assertThat(account.getBalance(), equalTo(new BigDecimal("50.00")));
	}
	
	@Test
	public void shouldAddMoneyToAccountOnDeposit() {
		//when
		account.deposit(new BigDecimal("10.00"));
		//then
		assertThat(account.getBalance(), equalTo(new BigDecimal("110.00")));
	}
}
