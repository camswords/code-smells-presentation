package code.smells.testing.take5;

import static code.smells.testing.take5.HasBalanceMatcher.hasBalance;
import static org.junit.Assert.assertThat;

import java.math.BigDecimal;

import org.junit.Test;

public class BankAccountTest {
	
	@Test
	public void shouldRemoveMoneyFromAccountOnWithdraw() {
		BankAccount account = new BankAccountBuilder().withAmount("100.00").build();
		account.withdraw(new BigDecimal("50.00"));
		assertThat(account, hasBalance("50.00"));
	}
	
	@Test
	public void shouldAddMoneyToAccountOnDeposit() {
		BankAccount account = new BankAccountBuilder().withAmount("100.00").build();
		account.deposit(new BigDecimal("10.00"));
		assertThat(account, hasBalance("110.00"));
	}
}
