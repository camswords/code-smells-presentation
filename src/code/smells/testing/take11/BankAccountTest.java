package code.smells.testing.take11;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import java.math.BigDecimal;

import org.junit.Test;

import code.smells.testing.take2.BankAccount;

public class BankAccountTest {
	
	@Test
	public void shouldRemoveMoneyFromAccountOnWithdraw() {
		BankAccount account = new BankAccount(202626, 12345678, new BigDecimal("100.00"));
		account.withdraw(new BigDecimal("50.00"));
		assertThat(account.getBalance(), equalTo(new BigDecimal("50.00")));
	}
	
	@Test
	public void shouldAddMoneyToAccountOnDeposit() {
		BankAccount account = new BankAccount(202626, 12345678, new BigDecimal("100.00"));
		account.deposit(new BigDecimal("10.00"));
		assertThat(account.getBalance(), equalTo(new BigDecimal("110.00")));
	}
}
