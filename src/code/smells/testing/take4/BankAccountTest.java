package code.smells.testing.take4;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import java.math.BigDecimal;

import org.junit.Test;

public class BankAccountTest {
	
	@Test
	public void shouldRemoveMoneyFromAccountOnWithdraw() {
		BankAccount account = new BankAccountBuilder().withAmount(new BigDecimal("100.00")).build();
		account.withdraw(new BigDecimal("50.00"));
		assertThat(account.getBalance(), equalTo(new BigDecimal("50.00")));
	}
	
	@Test
	public void shouldAddMoneyToAccountOnDeposit() {
		BankAccount account = new BankAccountBuilder().withAmount(new BigDecimal("100.00")).build();
		account.deposit(new BigDecimal("10.00"));
		assertThat(account.getBalance(), equalTo(new BigDecimal("110.00")));
	}
}
