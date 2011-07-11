package code.smells.testing.take1;

import java.math.BigDecimal;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class BankAccountTest {
	
	@Test
	public void shouldHandleMoney() {
		BankAccount account = new BankAccount(202626, 12345678, new BigDecimal("100.00"));

		account.withdraw(new BigDecimal("50.00"));
		assertThat(account.getBalance(), equalTo(new BigDecimal("50.00")));

		account.deposit(new BigDecimal("10.00"));
		assertThat(account.getBalance(), equalTo(new BigDecimal("60.00")));
	}
}
