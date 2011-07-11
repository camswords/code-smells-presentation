package code.smells.testing.take6;

import static code.smells.testing.take6.HasBalanceMatcher.hasBalance;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class BankAccountTest {
	
	@Test
	public void shouldRemoveMoneyFromAccountOnWithdraw() {
		BankAccount account = new BankAccountBuilder().withAmount("100.00").build();
		account.withdraw(new MoneyBuilder().withAmount("50.00").build());
		assertThat(account, hasBalance("50.00"));
	}
	
	@Test
	public void shouldAddMoneyToAccountOnDeposit() {
		BankAccount account = new BankAccountBuilder().withAmount("100.00").build();
		account.deposit(new MoneyBuilder().withAmount("10.00").build());
		assertThat(account, hasBalance("110.00"));
	}
}
